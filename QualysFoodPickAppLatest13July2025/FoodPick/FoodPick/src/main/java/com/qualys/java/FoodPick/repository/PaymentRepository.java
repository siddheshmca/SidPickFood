package com.qualys.java.FoodPick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qualys.java.FoodPick.entity.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long>  {

}
