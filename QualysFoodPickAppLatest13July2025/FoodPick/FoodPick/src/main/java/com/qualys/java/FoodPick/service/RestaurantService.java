package com.qualys.java.FoodPick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qualys.java.FoodPick.entity.Restaurant;
import com.qualys.java.FoodPick.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	public RestaurantRepository restaurantRepository;
	
	public void createNewRestaurant(Restaurant restaurant) {
		restaurantRepository.createNewRestaurant(restaurant.getRestaurantId(), restaurant.getRestaurantCategory(), restaurant.getRestaurantLocation(), restaurant.getRestaurantMenu(), restaurant.getRestaurantName());
	}
	
	public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.getAllRestaurants();
    }
	
	public String deleteRestaurant(int id) {
		int rows = restaurantRepository.deleteRestaurant(id);
		return rows > 0 ? "Restaurant Deleted Successfully." : "Restaurant Not Found.";
	}
	
}
