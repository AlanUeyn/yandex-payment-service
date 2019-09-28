package io.tsyrikov.paymentservice.model.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize
public class PaymentDto {

    @JsonCreator
    public PaymentDto() {}

    @JsonIgnore
    public PaymentDto(Integer amount, Integer senderId, Integer receiverId) {
        this.amount = amount;
        this.senderId = senderId;
        this.receiverId = receiverId;
    }

    @JsonProperty(required = true)
    private Integer amount;

    @JsonProperty(required = true)
    private Integer senderId;

    @JsonProperty(required = true)
    private Integer receiverId;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
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
