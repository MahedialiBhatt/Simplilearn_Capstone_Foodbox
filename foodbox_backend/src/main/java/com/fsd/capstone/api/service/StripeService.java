package com.fsd.capstone.api.service;

import com.fsd.capstone.api.dto.ChargeRequest;
import com.fsd.capstone.api.exception.FoodBoxServiceException;
import com.stripe.model.Charge;

public interface StripeService {

	Charge charge(ChargeRequest chargeRequest) throws FoodBoxServiceException;

}
