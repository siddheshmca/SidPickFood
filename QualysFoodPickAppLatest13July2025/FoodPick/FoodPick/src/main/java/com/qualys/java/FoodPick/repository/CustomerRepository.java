package com.qualys.java.FoodPick.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qualys.java.FoodPick.entity.Customer;

import jakarta.transaction.Transactional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO customer (cust_id, cust_Name, cust_email, cust_Phone_No) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
	void insertCustomer(int cust_id, String cust_Name, String cust_email, long cust_Phone_No);

	@Query(value = "SELECT * FROM customer", nativeQuery = true)
	List<Customer> fetchAllCustomers();

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Customer WHERE cust_id = :cust_id", nativeQuery = true)
	int deleteCustomerNative(@Param("cust_id") int cust_id);

	@Modifying
	@Transactional
	@Query(value = "UPDATE Customer SET cust_Name = :cust_Name, cust_email = :cust_email, cust_Phone_No = :cust_Phone_No  WHERE cust_id = :cust_id", nativeQuery = true)
	int updateCustomerDetails(@Param("cust_id") int cust_id, @Param("cust_Name") String custName,
			@Param("cust_email") String cust_email, @Param("cust_Phone_No") long cust_Phone_No);

	@Query(value = "SELECT * FROM Customer WHERE cust_id = :cust_id", nativeQuery = true)
	Optional<Customer> findById(@Param("cust_id") int cust_id);

}
