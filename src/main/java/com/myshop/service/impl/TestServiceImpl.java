package com.myshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.mapper.TestModelMapper;
import com.myshop.model.TestModel;
import com.myshop.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestModelMapper testModelMapper;
	
	
	public TestModel getById(Integer id){
		return testModelMapper.selectByPrimaryKey(id);
	}
	
	
	public TestModel selectById(TestModel testModel){
		return testModelMapper.selectById(testModel);
	}
}	
