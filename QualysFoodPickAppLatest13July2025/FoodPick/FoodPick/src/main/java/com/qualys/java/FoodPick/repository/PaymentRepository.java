package com.qualys.java.FoodPick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qualys.java.FoodPick.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>  {

}
