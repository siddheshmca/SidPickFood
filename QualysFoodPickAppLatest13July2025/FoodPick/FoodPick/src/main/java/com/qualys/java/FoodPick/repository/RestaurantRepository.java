package com.qualys.java.FoodPick.repository;

import java.util.List;
import java.util.Optional;

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
	@Query(value = "INSERT INTO restaurant (rest_id, rest_name, rest_location, rest_category, rest_menu, rest_phone_no) VALUES (?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	void createNewRestaurant(int rest_id, String rest_name, String rest_location, String rest_category,
			String rest_menu, long rest_phone_no);

	@Query(value = "SELECT * FROM restaurant", nativeQuery = true)
	List<Restaurant> getAllRestaurants();

	@Modifying
	@Transactional
	@Query(value = "UPDATE restaurant SET rest_name = :rest_name, rest_location = :rest_location, rest_category= :rest_category, rest_menu=:rest_menu, rest_phone_no = :rest_phone_no  WHERE rest_id = :rest_id", nativeQuery = true)
	int updateRestaurantDetails(@Param("rest_id") int rest_id, @Param("rest_name") String rest_name,
			@Param("rest_location") String rest_location, @Param("rest_category") String rest_category,
			@Param("rest_menu") String rest_menu, @Param("rest_phone_no") long rest_phone_no);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM restaurant WHERE rest_id = :rest_id", nativeQuery = true)
	int deleteRestaurant(@Param("rest_id") int rest_id);

	@Query(value = "SELECT * FROM restaurant WHERE rest_id = :rest_id", nativeQuery = true)
	Optional<Restaurant> findById(@Param("rest_id") int rest_id);
}