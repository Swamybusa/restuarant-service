package com.vcube.restaurantservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.restaurantservice.model.FoodItems;
import com.vcube.restaurantservice.repo.FoodItemRepo;

@Service
public class FoodItemsService {

	@Autowired
	FoodItemRepo foodItemRepo;

	public FoodItems createFoodItems(FoodItems foodItems) {

		return foodItemRepo.save(foodItems);

	}

	public List<FoodItems> findByRestaurantId(int id) {
		return foodItemRepo.findByRestaurantId(id);
	}
}
  