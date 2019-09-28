package io.tsyrikov.paymentservice.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 783971018771094150L;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "sender_id")
    private Integer senderId;

    @Column(name = "receiver_id")
    private Integer receiverId;

    @Column(name = "amount")
    private Integer amount;

    public Payment(Integer senderId, Integer receiverId, Integer amount) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.amount = amount;
    }

    public Payment() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
