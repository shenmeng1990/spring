package com.alibaba.springframework.beans.factory;


import com.alibaba.springframework.beans.config.Resource;
import com.alibaba.springframework.beans.config.XmlBeanDefinitionReader;

/**
 * 只需要实现对xml配置文件的加载以及BeanDefinition的注册即可，它不需要实现getBean方法
 * 
 * @author shenmeng
 *
 */
public class XmlBeanFactory extends DefaultListableBeanFactory {

	private XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(this);

	private Resource resource;

	public XmlBeanFactory(Resource resource) {
		this.resource = resource;
		loadBeanDefinitions();
	}

	public void loadBeanDefinitions() {
		xmlBeanDefinitionReader.loadBeanDefinitions(resource);
	}
}
