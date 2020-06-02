package com.alibaba.springframework.beans.factory;

import com.alibaba.springframework.beans.beandefinition.BeanDefinition;

/**
 * 只需要提供对bean的获取
 * @author shenmeng
 *
 */
public interface BeanFactory {

	Object getBean(String beanName);

}
