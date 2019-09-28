package io.tsyrikov.paymentservice.service.impl;

import io.tsyrikov.paymentservice.converter.PaymentConverter;
import io.tsyrikov.paymentservice.model.dto.PaymentDto;
import io.tsyrikov.paymentservice.model.entity.Payment;
import io.tsyrikov.paymentservice.repository.PaymentRepository;
import io.tsyrikov.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository repository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void sendPayments(List<PaymentDto> payments) {
        List<Payment> entities = payments.stream()
                .map(PaymentConverter::fromDto)
                .collect(Collectors.toList());
        repository.saveAll(entities);
    }

    @Override
    public Double getClientPayments(Integer senderId) {
        List<Payment> entities = repository.findAllBySenderId(senderId);
        return entities.stream()
                .map(Payment::getAmount)
                .reduce(0.0, Double::sum);
    }
}
