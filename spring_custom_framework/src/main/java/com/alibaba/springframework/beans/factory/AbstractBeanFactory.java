package com.alibaba.springframework.beans.factory;


import com.alibaba.springframework.beans.config.BeanDefinition;

public class AbstractBeanFactory implements BeanFactory {

	@Override
	public Object getBean(String beanName) {
		// Object bean = sinletonObjects.get(beanName);
		//
		// if (bean != null)
		// return bean;

		// 创建bean对象，然后放入map

		// 将要创建的bean的信息通过配置文件（xml）来配置
		// 读取配置文件中的bean信息，然后去创建bean对象
		// 查找beanDefinitionMap集合，获取知道beanname的BeanDefinition对象
		// 通过BeanDefinition对象的bean的信息去创建bean实例
		// 1.实例化---获取class信息，然后通过反射去创建该对象
		// 2.设置属性--获取该bean的PropertyValue集合，去遍历该集合，获取PropertyValue对象中的name和value
		// 需要对value进行处理（需要将字符串值的value，转成指定类型的value）
		// 通过反射去设置value值。
		// 3.初始化---获取bean标签的init-method属性，然后去通过反射，调用实例化对象的指定方法
		//
		// sinletonObjects.put(beanname,beanInstance)
		return null;
	}

	@Override
	public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
		// TODO Auto-generated method stub

	}

}
