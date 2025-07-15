package com.qualys.java.FoodPick.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qualys.java.FoodPick.entity.RestAddr;

import jakarta.transaction.Transactional;

@Repository
public interface RestAddrRepo extends JpaRepository<RestAddr, Long> {

	@Query(value = "SELECT * FROM rest_addr WHERE rest_id = :rest_id", nativeQuery = true)
	Optional<RestAddr> findAddrById(@Param("rest_id") int rest_id);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO rest_addr (rest_addr_id, rest_id, rest_shop_no, rest_street_name, rest_floor_num, rest_area, rest_city, rest_state, rest_pin_code) VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9)", nativeQuery = true)
	void addRestAddress(int rest_addr_id, int rest_id, int rest_shop_no, String rest_street_name, int rest_floor_num,
			String rest_area, String rest_city, String rest_state, int rest_pin_code);

	@Modifying
	@Transactional
	@Query(value = "UPDATE rest_addr SET rest_shop_no = :rest_shop_no, rest_street_name =:rest_street_name, rest_floor_num =:rest_floor_num, rest_area =:rest_area, rest_city =:rest_city, rest_state =:rest_state, rest_pin_code =:rest_pin_code  WHERE rest_id = :rest_id", nativeQuery = true)
	int updateRestAddr(@Param("rest_id") int rest_id, @Param("rest_shop_no") int rest_shop_no,
			@Param("rest_street_name") String rest_street_name, @Param("rest_floor_num") int rest_floor_num,
			@Param("rest_area") String rest_area, @Param("rest_city") String rest_city,
			@Param("rest_state") String rest_state, @Param("rest_pin_code") int rest_pin_code);

	@Query(value = "SELECT * FROM rest_addr", nativeQuery = true)
	List<RestAddr> getRestaurantAddress();

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM rest_addr WHERE rest_id = :rest_id", nativeQuery = true)
	int deleteRestaurantAddr(@Param("rest_id") int rest_id);
}
