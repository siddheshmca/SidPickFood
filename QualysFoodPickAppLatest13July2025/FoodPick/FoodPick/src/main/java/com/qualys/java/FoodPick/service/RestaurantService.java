package com.qualys.java.FoodPick.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qualys.java.FoodPick.DTO.RestaurantDTO;
import com.qualys.java.FoodPick.entity.RestAddr;
import com.qualys.java.FoodPick.entity.Restaurant;
import com.qualys.java.FoodPick.repository.RestAddrRepo;
import com.qualys.java.FoodPick.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	public RestaurantRepository restaurantRepository;

	@Autowired
	public RestAddrRepo restAddrRepo;

	public void createNewRestaurant(RestaurantDTO restaurant) {
		restaurantRepository.createNewRestaurant(restaurant.getRest_id(), restaurant.getRest_name(),
				restaurant.getRest_location(), restaurant.getRest_category(), restaurant.getRest_menu(),
				restaurant.getRest_phone_no());
	}

	public void saveRestaurantAddress(RestaurantDTO restaurant) {
		restAddrRepo.addRestAddress(restaurant.getRest_addr_id(), restaurant.getRest_id(), restaurant.getRest_shop_no(),
				restaurant.getRest_street_name(), restaurant.getRest_floor_num(), restaurant.getRest_area(),
				restaurant.getRest_city(), restaurant.getRest_state(), restaurant.getRest_pin_code());
	}

	public List<Restaurant> getAllRestaurants() {
		return restaurantRepository.getAllRestaurants();
	}

	public List<RestAddr> getRestaurantAddress() {
		return restAddrRepo.getRestaurantAddress();
	}

	public String deleteRestaurant(int id) {
		int rows = restaurantRepository.deleteRestaurant(id);
		return rows > 0 ? "Restaurant Deleted Successfully." : "Restaurant Not Found.";
	}

	public String deleteRestaurantAddr(int id) {
		int rows = restAddrRepo.deleteRestaurantAddr(id);
		return rows > 0 ? "Restaurant Deleted Successfully." : "Restaurant Not Found.";
	}

	public String updateRestaurantDetails(int id, RestaurantDTO restDelta) {

		Restaurant restaurant = getRestaurantDetails(id).get();

		boolean isUpdatedFlag = false;

		if (restDelta.getRest_name() == null) {
			restDelta.setRest_name(restaurant.getRest_name());
			isUpdatedFlag = false;
		}

		if (restDelta.getRest_location() == null) {
			restDelta.setRest_location(restaurant.getRest_location());
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_category() == null) {
			restDelta.setRest_category(restaurant.getRest_category());
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_menu() == null) {
			restDelta.setRest_menu(restaurant.getRest_menu());
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_phone_no() == 0L) {
			restDelta.setRest_phone_no(restaurant.getRest_phone_no());
			isUpdatedFlag = false;
		}

		if (restDelta.getRest_name() != null && !restDelta.getRest_name().equals(restaurant.getRest_name())) {
			restDelta.getRest_name();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_location() != null
				&& !restDelta.getRest_location().equals(restaurant.getRest_location())) {
			restDelta.getRest_location();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_category() != null
				&& !restDelta.getRest_category().equals(restaurant.getRest_category())) {
			restDelta.getRest_category();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_menu() != null && !restDelta.getRest_menu().equals(restaurant.getRest_menu())) {
			restDelta.getRest_menu();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_phone_no() != 0L && restaurant.getRest_phone_no() != restDelta.getRest_phone_no()) {
			restDelta.getRest_phone_no();
			isUpdatedFlag = true;
		}

		if (isUpdatedFlag) {
			int rows = restaurantRepository.updateRestaurantDetails(id, restDelta.getRest_name(),
					restDelta.getRest_location(), restDelta.getRest_category(), restDelta.getRest_menu(),
					restDelta.getRest_phone_no());
			return rows > 0 ? "Restaurant Details updated successfully." : "Restaurant not found.";
		} else {
			return "Nothing to Update";
		}
	}

	public String updateRestaurantAddress(int id, RestaurantDTO restDelta) {

		RestAddr restaurant = getRestaurantAddress(id).get();

		boolean isUpdatedFlag = false;

		if (restDelta.getRest_shop_no() == 0) {
			restDelta.setRest_shop_no(restaurant.getRest_shop_no());
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_street_name() == null) {
			restDelta.setRest_street_name(restaurant.getRest_street_name());
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_floor_num() == 0) {
			restDelta.setRest_floor_num(restaurant.getRest_floor_num());
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_area() == null) {
			restDelta.setRest_area(restaurant.getRest_area());
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_city() == null) {
			restDelta.setRest_city(restaurant.getRest_city());
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_pin_code() == 0) {
			restDelta.setRest_pin_code(restaurant.getRest_pin_code());
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_state() == null) {
			restDelta.setRest_state(restaurant.getRest_state());
			isUpdatedFlag = false;
		}

		if (restDelta.getRest_shop_no() != 0 && restDelta.getRest_shop_no() != restaurant.getRest_shop_no()) {
			restDelta.getRest_shop_no();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_floor_num() != 0 && restDelta.getRest_floor_num() != restaurant.getRest_floor_num()) {
			restDelta.getRest_floor_num();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_pin_code() != 0 && restDelta.getRest_pin_code() != restaurant.getRest_pin_code()) {
			restDelta.getRest_pin_code();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_street_name() != null
				&& !restDelta.getRest_street_name().equals(restaurant.getRest_street_name())) {
			restDelta.getRest_street_name();
			isUpdatedFlag = true;
		}
		if (restDelta.getRest_area() != null && !restDelta.getRest_area().equals(restaurant.getRest_area())) {
			restDelta.getRest_area();
			isUpdatedFlag = true;
		}
		if (restDelta.getRest_city() != null && !restDelta.getRest_city().equals(restaurant.getRest_city())) {
			restDelta.getRest_city();
			isUpdatedFlag = true;
		}
		if (restDelta.getRest_state() != null && !restDelta.getRest_state().equals(restaurant.getRest_state())) {
			restDelta.getRest_state();
			isUpdatedFlag = true;
		}

		if (isUpdatedFlag) {
			int rows = restAddrRepo.updateRestAddr(id, restDelta.getRest_shop_no(),
					restDelta.getRest_street_name(), restDelta.getRest_floor_num(), restDelta.getRest_area(),
					restDelta.getRest_city(), restDelta.getRest_state(), restDelta.getRest_pin_code());
			return rows > 0 ? "Restaurant Address updated successfully." : "Restaurant not found.";
		} else {
			return "Nothing to Update";
		}
	}

	private Optional<Restaurant> getRestaurantDetails(int id) {
		return restaurantRepository.findById(id);
	}

	private Optional<RestAddr> getRestaurantAddress(int id) {
		return restAddrRepo.findAddrById(id);
	}

}