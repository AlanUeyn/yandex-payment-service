package io.tsyrikov.paymentservice.converter;

import io.tsyrikov.paymentservice.model.dto.PaymentDto;
import io.tsyrikov.paymentservice.model.entity.Payment;

public class PaymentConverter {

    public static PaymentDto toDto(Payment payment) {
        return new PaymentDto(payment.getAmount(), payment.getSenderId(), payment.getReceiverId());
    }

    public static Payment fromDto(PaymentDto paymentDto) {
        return new Payment(paymentDto.getSenderId(), paymentDto.getReceiverId(), paymentDto.getAmount());
    }

}
