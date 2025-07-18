package com.qualys.java.FoodPick.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qualys.java.FoodPick.entity.Menu;

import jakarta.transaction.Transactional;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

	@Query(value = "SELECT * FROM menu WHERE rest_id = :rest_id", nativeQuery = true)
	List<Menu> findMenuByRestaurantId(@Param("rest_id") int rest_id);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (:item_id, :item_name, :item_price, :rest_id)", nativeQuery = true)
	void insertMenu(@Param("item_id") int item_id, @Param("item_name") String item_name,
			@Param("item_price") double item_price, @Param("rest_id") int rest_id);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (:item_id, :item_name, :item_price, :rest_id)", nativeQuery = true)
	void createMenu(@Param("item_id") int item_id, @Param("item_name") String item_name,
			@Param("item_price") double item_price, @Param("rest_id") int rest_id);

	@Modifying
	@Transactional
	@Query(value = "UPDATE menu SET item_name = :item_name, item_price = :item_price WHERE item_id = :item_id", nativeQuery = true)
	int updateMenu(@Param("item_id") int item_id, @Param("item_name") String item_name,
			@Param("item_price") double item_price);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM menu WHERE item_id = :item_id", nativeQuery = true)
	int deleteByItemId(@Param("item_id") int item_id);

	@Query(value = "SELECT r.rest_id, r.rest_name, r.rest_location, r.rest_phone_no, m.item_name, m.item_price FROM restaurant r JOIN menu m ON r.rest_id = m.rest_id WHERE r.rest_id = :rest_id", nativeQuery = true)
	List<Object[]> findMenuItemsByRestaurantId(@Param("rest_id") int rest_id);
	
	@Query(value = "SELECT * FROM menu WHERE item_id = :item_id", nativeQuery = true)
	Optional<Menu> findById(@Param("item_id") int rest_id);
}
