package com.fsd.capstone.api.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.capstone.api.entity.Order;
import com.fsd.capstone.api.entity.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findAllByCreatedDateTimeBetween(LocalDateTime createdDateTimeStart, LocalDateTime createdDateTimeEnd);

	List<Order> findByUser(User user);

	List<Order> findByUserAndCreatedDateTimeBetween(User user, LocalDateTime createdDateTimeStart,
			LocalDateTime createdDateTimeEnd);

}
