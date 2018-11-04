package com.hll.end.dao.oracle;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hll.end.model.User;

public interface UserMapper {
	@Select("select * from user")
	List<User> findAll();
}
