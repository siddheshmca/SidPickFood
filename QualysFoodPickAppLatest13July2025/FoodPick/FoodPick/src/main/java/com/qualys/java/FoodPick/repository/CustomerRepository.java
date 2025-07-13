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
	@Query(value = "INSERT INTO customer (custID, cust_Name, cust_Addr, cust_Phone_No) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
	void insertCustomer(int custID, String custName, String custAddr, long custPhoneNo);

	@Query(value = "SELECT * FROM customer", nativeQuery = true)
	List<Customer> fetchAllCustomers();

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Customer WHERE custID = :custID", nativeQuery = true)
	int deleteCustomerNative(@Param("custID") int custID);

	@Modifying
	@Transactional
	@Query(value = "UPDATE Customer SET cust_name = :custName, cust_addr = :custAddr, cust_phone_no = :custPhoneNo  WHERE custID = :custID", nativeQuery = true)
	int updatePartDetails(@Param("custID") int custID, @Param("custName") String custName,
			@Param("custAddr") String custAddr, @Param("custPhoneNo") long custPhoneNo);

	@Query(value = "SELECT * FROM Customer WHERE custID = :custID", nativeQuery = true)
	Optional<Customer> findById(@Param("custID") int custID);

}
