package com.myshop.service;

import com.myshop.model.TestModel;

public interface TestService {
	
	
	public TestModel getById(Integer id);
	
	public TestModel selectById(TestModel testModel);
}
