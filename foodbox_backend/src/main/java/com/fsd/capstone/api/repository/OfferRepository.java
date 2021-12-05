package com.fsd.capstone.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.capstone.api.entity.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
