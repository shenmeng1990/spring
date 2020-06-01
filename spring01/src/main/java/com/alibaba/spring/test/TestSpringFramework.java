package com.alibaba.spring.test;

import com.alibaba.spring.model.Student;
import com.alibaba.springframework.beans.config.ClasspathResource;
import com.alibaba.springframework.beans.config.Resource;
import com.alibaba.springframework.beans.factory.BeanFactory;
import com.alibaba.springframework.beans.factory.XmlBeanFactory;
import org.junit.Test;



public class TestSpringFramework {

	@Test
	public void test() throws Exception {
		// 1.指定xml配置文件的路径（字符串）?思考：路径是类路径还是磁盘文件路径还是URL网络路径？
		String location = "beans.xml";
		// 2.将资源信息封装成对象Resource，通过该对象可以获取InputStream
		Resource resource = new ClasspathResource(location);
		// 3.创建一个BeanFactory工厂
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		// 4.XmlBeanDefinationReader去读取xml文件，并进行解析，最后将解析出来的BeanDefinition注册到工厂中的集合
		Student student = (Student) beanFactory.getBean("student");
		System.out.println(student);
	}

}
