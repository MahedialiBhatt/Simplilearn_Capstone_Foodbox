package com.fsd.capstone.api.dao;

import java.util.List;

import com.fsd.capstone.api.dto.Fee;
import com.fsd.capstone.api.exception.FoodBoxDaoException;

public interface FeeDao {

	Fee getFee(String type) throws FoodBoxDaoException;

	List<Fee> getFees() throws FoodBoxDaoException;

	Fee save(Fee fee) throws FoodBoxDaoException;

	void remove(String type) throws FoodBoxDaoException;

}
