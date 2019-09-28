package io.tsyrikov.paymentservice.model.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Entity
@Table(name = "t_payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 783971018771094150L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Min(1)
    @Column(name = "sender_id")
    private Integer senderId;

    @Min(1)
    @Column(name = "receiver_id")
    private Integer receiverId;

    @Min(0)
    @Column(name = "amount")
    private Double amount;

    public Payment(Integer senderId, Integer receiverId, Double amount) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.amount = amount;
    }

    public Payment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
