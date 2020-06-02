package com.alibaba.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonRegister implements SingletonRegister {

	// 存储beanname和单例的bean实例之间的映射关系
	private Map<String, Object> sinletonObjects = new HashMap<>();

	@Override
	public Object getSingletonInstance(String beanName) {
		return this.sinletonObjects.get(beanName);
	}

	@Override
	public void addSingletonInstance(String beanName, Object bean) {

	}

}
