package io.tsyrikov.paymentservice.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentDto {

    public PaymentDto() {}

    @JsonIgnore
    public PaymentDto(Double amount, Integer senderId, Integer receiverId) {
        this.amount = amount;
        this.senderId = senderId;
        this.receiverId = receiverId;
    }

    @JsonProperty(required = true)
    private Double amount;

    @JsonProperty(required = true)
    private Integer senderId;

    @JsonProperty(required = true)
    private Integer receiverId;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    @Override
    public String toString() {
        return "PaymentDto{" +
                "amount=" + amount +
                ", sender='" + senderId + '\'' +
                ", receiver='" + receiverId + '\'' +
                '}';
    }
}
