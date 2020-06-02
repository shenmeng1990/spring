package com.alibaba.springframework.beans.factory;

/**
 * 此接口继承Aware接口 通过该接口，给实现该接口的类，注入BeanFactory实例
 * 
 * @author 灭霸詹
 *
 */
public interface BeanFactoryAware extends Aware {

	void setBeanFactory(BeanFactory beanFactory);
}
