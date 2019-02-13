package com.mj.provider.user.dao;

import org.apache.ibatis.annotations.Mapper;

import com.mj.provider.user.entity.User;

@Mapper
public interface UserMapper {
	User getUserByID(int id);
}
