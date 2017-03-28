package com.myshop.mapper;

import com.myshop.model.TestModel;
import com.myshop.service.utils.MyMapper;

public interface TestModelMapper extends MyMapper<TestModel> {
	
	
	public TestModel selectById(TestModel testModel);
	
}
