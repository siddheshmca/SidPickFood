package com.qualys.java.FoodPick.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qualys.java.FoodPick.DTO.MenuOpsDTO;
import com.qualys.java.FoodPick.entity.Menu;
import com.qualys.java.FoodPick.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;

	public void createMenu(MenuOpsDTO menu) {
		menuRepository.createMenu(menu.getItem_id(), menu.getItem_name(), menu.getItem_price(), menu.getRest_id());
	}

	
	public String updateMenuDetails(int id, MenuOpsDTO restDelta) {
		Menu menu = getMenuDetails(id).get();
		boolean isUpdatedFlag = false;

		if (restDelta.getItem_name() == null) {
			restDelta.setItem_name(menu.getItem_name());
			isUpdatedFlag = false;
		}

		if (restDelta.getItem_price() == 0.0d) {
			restDelta.setItem_price(menu.getItem_price());
			isUpdatedFlag = false;
		}

		if (restDelta.getItem_name() != null && !restDelta.getItem_name().equals(menu.getItem_name())) {
			restDelta.getItem_name();
			isUpdatedFlag = true;
		}

		
		if (restDelta.getItem_price() != 0.0d && menu.getItem_price() != restDelta.getItem_price()) {
			restDelta.getItem_price();
			isUpdatedFlag = true;
		}

		if (isUpdatedFlag) {
			int rows = menuRepository.updateMenu(id, restDelta.getItem_name(), restDelta.getItem_price());
			return rows > 0 ? "Menu Details updated successfully." : "Menu not found.";
		} else {
			return "Nothing to Update";
		}
	}

	private Optional<Menu> getMenuDetails(int id) {
		return menuRepository.findById(id);
	}

}