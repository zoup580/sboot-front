package com.myshop.entity;

import com.myshop.model.BaseEntity;

public class TestEntity extends BaseEntity {
	
	private String name;
	
	private Long age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
	
	
	
	
}
