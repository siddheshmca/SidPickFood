package com.qualys.java.FoodPick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qualys.java.FoodPick.IdGenerator.GenerateIdImpl;
import com.qualys.java.FoodPick.entity.Restaurant;
import com.qualys.java.FoodPick.service.RestaurantService;

@RestController
@RequestMapping("/foodpick/restaurant")
public class RestaurantController {

	@Autowired(required = true)
	public GenerateIdImpl genId;

	@Autowired
	private RestaurantService restaurantService;

	@PostMapping
	public ResponseEntity<String> createCustomer(@RequestBody Restaurant restaurant) {
		restaurant.setRestaurantId(genId.generateId());
		System.out.println(restaurant.getRestaurantId());
		restaurantService.createNewRestaurant(restaurant);
		return ResponseEntity.ok("Done");
	}
	
	@GetMapping
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
        List<Restaurant> restaurants = restaurantService.getAllRestaurants();
        return ResponseEntity.ok(restaurants);
    }
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
		String message = restaurantService.deleteRestaurant(id);
		if (message.contains("successfully")) {
			return ResponseEntity.ok(message);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
