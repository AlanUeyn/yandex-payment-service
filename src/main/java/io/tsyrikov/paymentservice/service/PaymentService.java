package io.tsyrikov.paymentservice.service;

import io.tsyrikov.paymentservice.model.dto.PaymentDto;

import java.util.List;

public interface PaymentService {

    void sendPayments(List<PaymentDto> payments);

    Double getClientPayments(Integer senderId);

}
