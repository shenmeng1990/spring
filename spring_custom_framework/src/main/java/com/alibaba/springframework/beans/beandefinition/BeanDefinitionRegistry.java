package com.alibaba.springframework.beans.beandefinition;

/***
 * BeanDefinition注册中心
 * @author 灭霸詹
 *
 */
public interface BeanDefinitionRegistry {

	/**
	 * 注册BeanDefinition
	 * 
	 * @param beanName
	 * @param beanDefinition
	 */
	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

	/**
	 * 根据bean名称获取BeanDefinition对象
	 * 
	 * @param beanName
	 * @return
	 */
	BeanDefinition getBeanDefinition(String beanName);

	/**
	 * 获取所有BeanDefinition的beanname名称
	 * 
	 * @return
	 */
	String[] getBeanDefinitionNames();

	/**
	 * BeanDefinition注册中心中，是否包含指定beanName的BeanDefinition对象
	 * 
	 * @param beanName
	 * @return
	 */
	boolean containBeanDefinition(String beanName);
}
