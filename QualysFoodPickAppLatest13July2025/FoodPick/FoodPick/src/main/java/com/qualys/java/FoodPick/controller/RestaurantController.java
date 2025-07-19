package com.qualys.java.FoodPick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qualys.java.FoodPick.DTO.RestMenuDTO;
import com.qualys.java.FoodPick.DTO.RestaurantDTO;
import com.qualys.java.FoodPick.IdGenerator.GenerateIdImpl;
import com.qualys.java.FoodPick.IdGenerator.GenerateMenuItemId;
import com.qualys.java.FoodPick.entity.RestAddr;
import com.qualys.java.FoodPick.service.MenuService;
import com.qualys.java.FoodPick.service.RestaurantService;

@RestController
@RequestMapping("/foodpick/restaurant")
public class RestaurantController {

	@Autowired(required = true)
	public GenerateIdImpl genId;

	@Autowired(required = true)
	public GenerateMenuItemId menuItemId;

	@Autowired
	private RestaurantService restaurantService;

	@Autowired
	private MenuService menuService;

	@PostMapping
	public ResponseEntity<String> createRestaurant(@RequestBody RestaurantDTO restaurant) {
		restaurant.setRest_id(genId.generateId());
		restaurantService.createNewRestaurant(restaurant);
		restaurant.setRest_addr_id(genId.generateId());
		restaurantService.saveRestaurantAddress(restaurant);
		restaurant.setItem_id(menuItemId.generateId());
		restaurantService.addMenuItems(restaurant);
		return ResponseEntity.ok("Done");
	}

	@RequestMapping(value = "/viewRest/{rest_id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<RestMenuDTO> getAllRestaurants(@PathVariable int rest_id) {
		RestMenuDTO restaurants = restaurantService.getRestaurantMenuDetails(rest_id);
		return ResponseEntity.ok(restaurants);
	}

	@RequestMapping(value = "/restAddrDetails", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<RestAddr>> getRestAddress() {
		List<RestAddr> restaurantAddr = restaurantService.getRestaurantAddress();
		return ResponseEntity.ok(restaurantAddr);
	}

	@RequestMapping(value = "restChange/{id}", method = RequestMethod.PATCH, consumes = "application/json")
	public ResponseEntity<String> updateRestaurant(@PathVariable int id, @RequestBody RestaurantDTO restaurant) {
		String message = restaurantService.updateRestaurantDetails(id, restaurant);
		if (message.contains("successfully")) {
			return ResponseEntity.ok(message);
		} else if (message.contains("Nothing")) {
			return ResponseEntity.badRequest().body(message);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(value = "restAddrChange/{id}", method = RequestMethod.PATCH, consumes = "application/json")
	public ResponseEntity<String> updateRestaurantAddress(@PathVariable int id, @RequestBody RestaurantDTO restaurant) {
		String message = restaurantService.updateRestaurantAddress(id, restaurant);
		if (message.contains("successfully")) {
			return ResponseEntity.ok(message);
		} else if (message.contains("Nothing")) {
			return ResponseEntity.badRequest().body(message);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRestaurant(@PathVariable int id) {
		String menuDel = menuService.deleteMenu(id);
		String restAddrDel = restaurantService.deleteRestaurantAddr(id);
		String restDel = restaurantService.deleteRestaurant(id);
		if (restAddrDel.contains("Successfully") && restDel.contains("Successfully")
				&& menuDel.contains("Successfully")) {
			return ResponseEntity.ok(restAddrDel + restDel);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
