package com.hll.end.dao.mysql;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hll.end.model.Book;

public interface BookMapper {
	 @Select("select * from book")
	 List<Book> findAll();
}
