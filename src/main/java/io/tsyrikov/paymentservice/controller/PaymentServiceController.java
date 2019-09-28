package io.tsyrikov.paymentservice.controller;

import io.tsyrikov.paymentservice.model.dto.PaymentDto;
import io.tsyrikov.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PaymentServiceController {

    private final PaymentService service;

    @Autowired
    public PaymentServiceController(PaymentService service) {
        this.service = service;
    }

    @PostMapping("/load")
    public ResponseEntity loadPayments(@RequestBody List<PaymentDto> paymentDto) {
        service.sendPayments(paymentDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping("/payments/{id}")
    public ResponseEntity<List<PaymentDto>> getClientPayments(@PathVariable("id") Integer id) {
        List<PaymentDto> payments = service.getClientPayments(id);
        return ResponseEntity.ok().body(payments);
    }

}
