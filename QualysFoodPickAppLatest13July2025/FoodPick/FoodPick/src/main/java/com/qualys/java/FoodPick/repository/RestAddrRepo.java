package com.qualys.java.FoodPick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qualys.java.FoodPick.entity.RestAddr;

@Repository
public interface RestAddrRepo extends JpaRepository<RestAddr, Long>  {

}
