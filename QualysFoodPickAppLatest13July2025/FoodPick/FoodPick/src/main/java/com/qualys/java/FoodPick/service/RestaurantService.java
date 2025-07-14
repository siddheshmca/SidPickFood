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
		restaurantRepository.createNewRestaurant(restaurant.getRest_id(), restaurant.getRest_name(),
				restaurant.getRest_location(), restaurant.getRest_category(), restaurant.getRest_menu(),
				restaurant.getRest_phone_no());
	}

	public List<Restaurant> getAllRestaurants() {
		return restaurantRepository.getAllRestaurants();
	}

	public String deleteRestaurant(int id) {
		int rows = restaurantRepository.deleteRestaurant(id);
		return rows > 0 ? "Restaurant Deleted Successfully." : "Restaurant Not Found.";
	}

	public String updateRestaurantDetails(int id, Restaurant restDelta) {

		String restName = getPrevRestName(id);
		String restLoc = getPrevRestLoc(id);
		String restCat = getPrevRestCat(id);
		String restMenu = getPrevRestMenu(id);
		long restPhoneNo = getPrevRestPhoneNo(id);

		boolean isUpdatedFlag = false;

		if (restDelta.getRest_name() == null) {
			restDelta.setRest_name(restName);
			isUpdatedFlag = false;
		}

		if (restDelta.getRest_location() == null) {
			restDelta.setRest_location(restLoc);
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_category() == null) {
			restDelta.setRest_category(restCat);
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_menu() == null) {
			restDelta.setRest_menu(restMenu);
			isUpdatedFlag = false;
		}
		if (restDelta.getRest_phone_no() == 0L) {
			restDelta.setRest_phone_no(restPhoneNo);
			isUpdatedFlag = false;
		}

		if (restDelta.getRest_name() != null && !restDelta.getRest_name().equals(restName)) {
			restDelta.getRest_name();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_location() != null && !restDelta.getRest_location().equals(restLoc)) {
			restDelta.getRest_location();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_category() != null && !restDelta.getRest_category().equals(restCat)) {
			restDelta.getRest_category();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_menu() != null && !restDelta.getRest_menu().equals(restMenu)) {
			restDelta.getRest_menu();
			isUpdatedFlag = true;
		}

		if (restDelta.getRest_phone_no() != 0L && restPhoneNo != restDelta.getRest_phone_no()) {
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

	private String getPrevRestName(int id) {
		return restaurantRepository.findById(id).map(Restaurant::getRest_name).orElse(null);
	}

	private String getPrevRestLoc(int id) {
		return restaurantRepository.findById(id).map(Restaurant::getRest_location).orElse(null);
	}

	private String getPrevRestCat(int id) {
		return restaurantRepository.findById(id).map(Restaurant::getRest_category).orElse(null);
	}

	private String getPrevRestMenu(int id) {
		return restaurantRepository.findById(id).map(Restaurant::getRest_menu).orElse(null);
	}

	private long getPrevRestPhoneNo(int id) {
		return restaurantRepository.findById(id).map(Restaurant::getRest_phone_no).orElse(null);
	}
}