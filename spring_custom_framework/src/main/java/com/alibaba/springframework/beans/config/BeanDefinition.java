package com.alibaba.springframework.beans.config;

import java.util.ArrayList;
import java.util.List;

public class BeanDefinition {
	private String clazzName;
	private String beanName;
	private String initMethod;

	/**
	 * bean中的属性信息
	 */
	private List<PropertyValue> propertyValues = new ArrayList<>();

	public BeanDefinition(String clazzName, String beanName) {
		this.beanName = beanName;
		this.clazzName = clazzName;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanClassName() {
		return clazzName;
	}

	public void setBeanClassName(String beanClassName) {
		this.clazzName = beanClassName;
	}

	public String getInitMethod() {
		return initMethod;
	}

	public void setInitMethod(String initMethod) {
		this.initMethod = initMethod;
	}

	public List<PropertyValue> getPropertyValues() {
		return propertyValues;
	}

	public void addPropertyValue(PropertyValue propertyValue) {
		this.propertyValues.add(propertyValue);
	}

}
