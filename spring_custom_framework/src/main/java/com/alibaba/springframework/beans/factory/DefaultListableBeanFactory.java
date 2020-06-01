package com.alibaba.springframework.beans.factory;

import com.alibaba.springframework.beans.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * spring容器的核心实现
 * 
 * @author 灭霸詹
 *
 */
public class DefaultListableBeanFactory extends AbstractBeanFactory {

	// 存储beanname和单例的bean实例之间的映射关系
	private Map<String, Object> sinletonObjects = new HashMap<>();

	// 存储的beanname和BeanDefinition对象的映射关系，该集合的数据是由配置文件加载和解析而来
	private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

	@Override
	public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
		this.beanDefinitionMap.put(beanName, beanDefinition);
	}
}
