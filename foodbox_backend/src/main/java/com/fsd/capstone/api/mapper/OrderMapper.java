package com.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { OrderItemMapper.class, UserMapperService.class })
public interface OrderMapper
		extends EntityDtoMapper<com.fsd.capstone.api.dto.Order, com.fsd.capstone.api.entity.Order> {

	@Mapping(source = "userId", target = "user")
	com.fsd.capstone.api.entity.Order toEntity(com.fsd.capstone.api.dto.Order dto);

	@Mapping(source = "user", target = "userId")
	com.fsd.capstone.api.dto.Order toDto(com.fsd.capstone.api.entity.Order entity);

}
