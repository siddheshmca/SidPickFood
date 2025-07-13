package com.qualys.java.FoodPick.IdGenerator;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GenerateIdImpl implements GenerateId {

	@Bean
	@Override
	public int generateId() {
		int id = ThreadLocalRandom.current().nextInt(100000, 1000000);
		return id;
	}
}