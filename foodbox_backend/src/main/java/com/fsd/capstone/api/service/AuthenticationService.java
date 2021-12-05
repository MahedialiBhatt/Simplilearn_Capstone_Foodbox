package com.fsd.capstone.api.service;

import com.fsd.capstone.api.dto.User;
import com.fsd.capstone.api.exception.FoodBoxServiceException;

public interface AuthenticationService {

	User login(String email, String password, String role) throws FoodBoxServiceException;

	User register(User user) throws FoodBoxServiceException;

}
