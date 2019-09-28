package io.tsyrikov.paymentservice.repository;

import io.tsyrikov.paymentservice.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    List<Payment> findAllBySenderId(Integer id);

}
