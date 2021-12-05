package com.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapperService {

	default com.fsd.capstone.api.entity.Category findById(Long id) {
		if (id == null) {
			return null;
		}

		com.fsd.capstone.api.entity.Category category = new com.fsd.capstone.api.entity.Category();
		category.setId(id);

		return category;
	}

	default Long findByCategory(com.fsd.capstone.api.entity.Category category) {
		if (category == null) {
			return null;
		}

		return category.getId();
	}

}
