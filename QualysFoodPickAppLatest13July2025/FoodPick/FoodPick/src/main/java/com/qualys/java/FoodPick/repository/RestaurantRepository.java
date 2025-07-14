package com.qualys.java.FoodPick.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.qualys.java.FoodPick.entity.Restaurant;

import jakarta.transaction.Transactional;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, ID> {

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO restaurant (restaurant_id, restaurant_category, restaurant_location, restaurant_menu, restaurant_name) VALUES (?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
	void createNewRestaurant(int restaurantId, String restaurantCategory, String restaurantLocation,
			List<String> restaurantMenu, String restaurantName);

	@Query(value = "SELECT * FROM restaurant", nativeQuery = true)
	List<Restaurant> getAllRestaurants();
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM restaurant WHERE restaurantId = :restaurantId", nativeQuery = true)
	int deleteRestaurant(@Param("restaurantId") int restaurantId);
}