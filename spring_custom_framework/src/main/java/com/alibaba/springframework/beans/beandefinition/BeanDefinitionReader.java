package com.alibaba.springframework.beans.beandefinition;

import com.alibaba.springframework.beans.config.Resource;

public interface BeanDefinitionReader {
	 void loadBeanDefinitions(Resource resource);
}
