package com.qualys.java.FoodPick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.qualys.java.FoodPick.entity.CustFoodOrder;

@Repository
public interface OrderRepository extends JpaRepository<CustFoodOrder, ID> {

}
