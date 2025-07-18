package com.qualys.java.FoodPick.IdGenerator;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component
public class GenerateMenuItemId implements GenerateId {

	@Override
	public int generateId() {
		int id = ThreadLocalRandom.current().nextInt(100, 1000);
		return id;
	}

}
