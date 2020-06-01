package com.alibaba.springframework.beans.config;

import java.io.InputStream;

import com.alibaba.springframework.beans.factory.BeanFactory;
import com.alibaba.springframework.beans.utils.DocumentReader;
import org.dom4j.Document;



public class XmlBeanDefinitionReader implements BeanDefinitionReader {

	private BeanFactory beanFactory;

	public XmlBeanDefinitionReader(BeanFactory beanFactory) {
		super();
		this.beanFactory = beanFactory;
	}

	@Override
	public void loadBeanDefinitions(Resource resource) {
		InputStream inputStream = resource.getInputStream();
		Document document = DocumentReader.createDocument(inputStream);
		XmlBeanDefinationDocumentReader documentReader = new XmlBeanDefinationDocumentReader(beanFactory);
		documentReader.loadBeanDefinations(document.getRootElement());
	}
}
