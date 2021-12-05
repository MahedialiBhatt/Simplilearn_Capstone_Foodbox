package com.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CategoryMapper extends
		EntityDtoMapper<com.fsd.capstone.api.dto.Category, com.fsd.capstone.api.entity.Category> {

	@Mapping(target = "image", ignore = true)
	com.fsd.capstone.api.entity.Category toEntity(com.fsd.capstone.api.dto.Category dto);

	@Mapping(target = "image", ignore = true)
	com.fsd.capstone.api.dto.Category toDto(com.fsd.capstone.api.entity.Category entity);
	
}
