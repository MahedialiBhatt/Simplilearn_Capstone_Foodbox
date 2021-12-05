package com.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;

@Mapper(uses = { FoodMapper.class })
public interface OrderItemMapper extends
		EntityDtoMapper<com.fsd.capstone.api.dto.OrderItem, com.fsd.capstone.api.entity.OrderItem> {

	com.fsd.capstone.api.entity.OrderItem toEntity(com.fsd.capstone.api.dto.OrderItem dto);

	com.fsd.capstone.api.dto.OrderItem toDto(com.fsd.capstone.api.entity.OrderItem entity);

}
