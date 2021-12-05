package com.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapperService {

	default com.fsd.capstone.api.entity.User findById(String email) {
		if (email == null) {
			return null;
		}

		com.fsd.capstone.api.entity.User user = new com.fsd.capstone.api.entity.User();
		user.setEmail(email);

		return user;
	}

	default String findByUser(com.fsd.capstone.api.entity.User user) {
		if (user == null) {
			return null;
		}

		return user.getEmail();
	}

}
