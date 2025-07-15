package com.qualys.java.FoodPick.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qualys.java.FoodPick.entity.CustAddr;

import jakarta.transaction.Transactional;

@Repository
public interface CustAddrRepository extends JpaRepository<CustAddr, Long> {

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO cust_addr (cust_addr_id, cust_id, cust_flat_num, cust_floor_num, cust_wing, cust_bldg_name, cust_society_name, cust_street_name, cust_area, cust_city, cust_state, cust_pin_code) VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12)", nativeQuery = true)
	void addCustomerAddress(int cust_addr_id, int cust_id, int cust_flat_num, int cust_floor_num, String cust_wing,
			String cust_bldg_name, String cust_society_name, String cust_street_name, String cust_area,
			String cust_city, String cust_state, int cust_pin_code);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM cust_addr WHERE cust_id = :cust_id", nativeQuery = true)
	int deleteCustomerAddress(@Param("cust_id") int cust_id);
	
	@Query(value = "SELECT * FROM cust_addr", nativeQuery = true)
	List<CustAddr> fetchCustomerAddr();

	@Modifying
	@Transactional
	@Query(value = "UPDATE cust_addr SET cust_flat_num = :cust_flat_num, cust_floor_num = :cust_floor_num, cust_wing = :cust_wing, cust_bldg_name = :cust_bldg_name, cust_society_name = :cust_society_name, cust_street_name =:cust_street_name, cust_area =:cust_area, cust_city =:cust_city, cust_state =:cust_state, cust_pin_code =:cust_pin_code    WHERE cust_id = :cust_id", nativeQuery = true)
	int updateCustomerAddress(@Param("cust_id") int cust_id, @Param("cust_flat_num") int cust_flat_num,
			@Param("cust_floor_num") int cust_floor_num, @Param("cust_wing") String cust_wing,
			@Param("cust_bldg_name") String cust_bldg_name, @Param("cust_society_name") String cust_society_name,
			@Param("cust_street_name") String cust_street_name, @Param("cust_area") String cust_area,
			@Param("cust_city") String cust_city, @Param("cust_state") String cust_state,
			@Param("cust_pin_code") int cust_pin_code);

	@Query(value = "SELECT * FROM cust_addr WHERE cust_id = :cust_id", nativeQuery = true)
	Optional<CustAddr> findAddrById(@Param("cust_id") int cust_id);
}