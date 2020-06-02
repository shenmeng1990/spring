package com.alibaba.springframework.beans.config;

import java.io.InputStream;

import com.alibaba.springframework.beans.beandefinition.BeanDefinitionReader;
import com.alibaba.springframework.beans.beandefinition.BeanDefinitionRegistry;
import com.alibaba.springframework.beans.utils.DocumentReader;
import org.dom4j.Document;



public class XmlBeanDefinitionReader implements BeanDefinitionReader {

	/**
	 * 依赖注入一个BeanDefinition注册中心
	 */
	private BeanDefinitionRegistry beanDefinitionRegistry;

	public XmlBeanDefinitionReader(BeanDefinitionRegistry beanDefinitionRegistry) {
		this.beanDefinitionRegistry = beanDefinitionRegistry;
	}

	@Override
	public void loadBeanDefinitions(Resource resource) {
		InputStream inputStream = resource.getInputStream();
		Document document = DocumentReader.createDocument(inputStream);
		XmlBeanDefinitionDocumentReader documentReader = new XmlBeanDefinitionDocumentReader(beanDefinitionRegistry);
		documentReader.loadBeanDefinations(document.getRootElement());
	}
}
