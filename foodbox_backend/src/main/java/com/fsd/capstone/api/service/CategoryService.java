package com.fsd.capstone.api.service;

import java.util.List;

import com.fsd.capstone.api.dto.Category;
import com.fsd.capstone.api.exception.FoodBoxServiceException;

public interface CategoryService {

	List<Category> getCategories(Boolean enabled) throws FoodBoxServiceException;

	Category getCategory(Long id) throws FoodBoxServiceException;

	Category createCategory(Category category) throws FoodBoxServiceException;

	Category updateCategory(Category category) throws FoodBoxServiceException;

	Category deleteCategory(Long id) throws FoodBoxServiceException;

	Category setEnabled(Long id, Boolean enabled) throws FoodBoxServiceException;

	byte[] getCategoryImage(Long id) throws FoodBoxServiceException;

}
