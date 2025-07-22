package com.qualys.java.FoodPick.IdGenerator;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component
public class GenerateOrderId  implements GenerateId{

	@Override
	public int generateId() {
		int id = ThreadLocalRandom.current().nextInt(100, 1000000);
		return id;
	}
	
}
