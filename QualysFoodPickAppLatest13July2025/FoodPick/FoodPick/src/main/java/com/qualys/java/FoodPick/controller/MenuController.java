package com.qualys.java.FoodPick.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qualys.java.FoodPick.DTO.MenuDTO;
import com.qualys.java.FoodPick.DTO.MenuOpsDTO;
import com.qualys.java.FoodPick.IdGenerator.GenerateMenuItemId;
import com.qualys.java.FoodPick.service.MenuService;

@RestController
@RequestMapping("/foodpick/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@Autowired(required = true)
	public GenerateMenuItemId menuItemId;

	@RequestMapping(value = "/createMenu/{rest_id}", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> addMenuItem(@PathVariable("rest_id") int rest_id, @RequestBody MenuOpsDTO menu) {
		menu.setItem_id(menuItemId.generateId());
		menu.setRest_id(rest_id);
		menuService.createMenu(menu);
		return ResponseEntity.ok("Done");
	}

	@RequestMapping(value = "menuChange/{item_id}", method = RequestMethod.PATCH, consumes = "application/json")
	public ResponseEntity<String> updateMenu(@PathVariable int item_id, @RequestBody MenuOpsDTO menu) {
		String message = menuService.updateMenuDetails(item_id, menu);
		if (message.contains("successfully")) {
			return ResponseEntity.ok(message);
		} else if (message.contains("Nothing")) {
			return ResponseEntity.badRequest().body(message);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/viewMenu/{rest_id}")
	public ResponseEntity<List<MenuDTO>> getMenuByRestaurantId(@PathVariable("rest_id") int rest_id) {
		List<MenuDTO> menuList = menuService.getMenuByRestaurantId(rest_id);

		if (menuList.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
		}

		return ResponseEntity.ok(menuList);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteMenu(@PathVariable int id) {
		String menuDel = menuService.deleteMenu(id);
		if (menuDel.contains("Successfully")) {
			return ResponseEntity.ok(menuDel);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("item/{id}")
	public ResponseEntity<String> deleteItemFromMenu(@PathVariable int id) {
		String menuDel = menuService.deleteItemFromMenu(id);
		if (menuDel.contains("Successfully")) {
			return ResponseEntity.ok(menuDel);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}