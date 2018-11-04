package com.hll.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hll.end.dao.mysql.BookMapper;
import com.hll.end.dao.oracle.UserMapper;

@RestController
public class TestCtrl {	
	
	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/testa")
	public String test1() {
		return bookMapper.findAll().get(0).getName();		
	}
	
	@RequestMapping("/testb")
	public String test2() {
		return userMapper.findAll().get(0).getLoginname();		
	}
}
