package com.fsd.capstone.api.service;

import java.util.List;

import com.fsd.capstone.api.dto.Offer;
import com.fsd.capstone.api.exception.FoodBoxServiceException;

public interface OfferService {

	List<Offer> getOffers() throws FoodBoxServiceException;

	Offer getOffer(Long id) throws FoodBoxServiceException;

	Offer createOffer(Offer offer) throws FoodBoxServiceException;

	Offer updateOffer(Offer offer) throws FoodBoxServiceException;

	Offer deleteOffer(Long id) throws FoodBoxServiceException;

}
