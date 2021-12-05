package com.fsd.capstone.api.service;

import java.math.BigDecimal;

import com.fsd.capstone.api.dto.Category;
import com.fsd.capstone.api.dto.Food;
import com.fsd.capstone.api.dto.Foods;
import com.fsd.capstone.api.dto.Offer;
import com.fsd.capstone.api.dto.PageInfo;
import com.fsd.capstone.api.exception.FoodBoxServiceException;

public interface FoodService {

	Foods getFoods(Boolean enabled, PageInfo pageInfo) throws FoodBoxServiceException;

	Foods getFoodsByName(String name, Boolean enabled, PageInfo pageInfo) throws FoodBoxServiceException;

	Foods getFoodsByCategory(Category category, Boolean enabled, PageInfo pageInfo) throws FoodBoxServiceException;

	Foods getFoodsByPrice(BigDecimal price, Boolean enabled, PageInfo pageInfo) throws FoodBoxServiceException;

	Foods getFoodsByOffer(Offer offer, Boolean enabled, PageInfo pageInfo) throws FoodBoxServiceException;

	Foods getFoodsByCategoryAndOffer(Category category, Offer offer, Boolean enabled, PageInfo pageInfo)
			throws FoodBoxServiceException;

	Foods searchFoods(String keyword, Boolean enabled, PageInfo pageInfo) throws FoodBoxServiceException;

	Food getFood(Long id) throws FoodBoxServiceException;

	Food createFood(Food food) throws FoodBoxServiceException;

	Food updateFood(Food food) throws FoodBoxServiceException;

	Food deleteFood(Long id) throws FoodBoxServiceException;

	Food setEnabled(Long id, Boolean enabled) throws FoodBoxServiceException;

	byte[] getFoodImage(Long id) throws FoodBoxServiceException;

}
