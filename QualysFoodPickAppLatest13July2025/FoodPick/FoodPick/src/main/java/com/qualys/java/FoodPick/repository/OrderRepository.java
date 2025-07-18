package com.qualys.java.FoodPick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qualys.java.FoodPick.entity.CustFoodOrder;

import jakarta.transaction.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<CustFoodOrder, Long> {

	@Modifying
	@Transactional
	@Query(value = """
			INSERT INTO cust_food_order
			(cf_order_id, rest_id, cust_id, cust_Phone_No, cust_addr_id,
			 cf_order_date, cf_order_items, cf_price_items, cf_order_quantity,
			 cf_order_amount, cf_order_status, cf_order_delivery_location)
			VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12)
			""", nativeQuery = true)
	void placeOrder(int cf_order_id, int rest_id, int cust_id, long cust_Phone_No, int cust_addr_id,
			java.time.LocalDateTime cf_order_date, String cf_order_items, double cf_price_items,
			double cf_order_quantity, double cf_order_amount, String cf_order_status,
			String cf_order_delivery_location);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM cust_food_order WHERE cust_id = :cust_id", nativeQuery = true)
	int deleteCustomerNative(@Param("cust_id") int cust_id);
}