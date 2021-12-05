package com.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface OfferMapperService {

	default com.fsd.capstone.api.entity.Offer findById(Long id) {
		if (id == null) {
			return null;
		}

		com.fsd.capstone.api.entity.Offer offer = new com.fsd.capstone.api.entity.Offer();
		offer.setId(id);

		return offer;
	}

	default Long findByOffer(com.fsd.capstone.api.entity.Offer offer) {
		if (offer == null) {
			return null;
		}

		return offer.getId();
	}

}
