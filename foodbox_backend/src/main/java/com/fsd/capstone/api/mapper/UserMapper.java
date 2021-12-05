package com.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper
		extends EntityDtoMapper<com.fsd.capstone.api.dto.User, com.fsd.capstone.api.entity.User> {

}
