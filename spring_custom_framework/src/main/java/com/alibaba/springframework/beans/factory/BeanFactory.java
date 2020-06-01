package com.alibaba.springframework.beans.factory;

import com.alibaba.springframework.beans.config.BeanDefinition;

/**
 * 只需要提供对bean的获取
 * @author 灭霸詹
 *
 */
public interface BeanFactory {

	Object getBean(String beanName);

	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
