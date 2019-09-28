package io.tsyrikov.paymentservice.controller;

import io.tsyrikov.paymentservice.model.dto.PaymentDto;
import io.tsyrikov.paymentservice.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PaymentServiceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentServiceController.class);

    private final PaymentService service;

    @Autowired
    public PaymentServiceController(PaymentService service) {
        this.service = service;
    }

    @PostMapping("/load")
    public ResponseEntity loadPayments(@RequestBody @Valid List<PaymentDto> paymentDto) {
        service.sendPayments(paymentDto);
        LOGGER.info("Payments have been processed!");
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping("/payments/{id}")
    public ResponseEntity<Double> getClientPayments(@PathVariable("id") Integer id) {
        Double payments = service.getClientPayments(id);
        LOGGER.info("Total amount of payment for sender with ID {} - {}", id, payments);
        return ResponseEntity.ok().body(payments);
    }

}
