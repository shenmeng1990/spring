package com.alibaba.springframework.beans.factory;

public interface SingletonRegister {

	Object getSingletonInstance(String beanName);

	void addSingletonInstance(String beanName, Object bean);
}
