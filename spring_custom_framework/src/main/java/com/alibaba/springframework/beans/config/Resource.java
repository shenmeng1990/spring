package com.alibaba.springframework.beans.config;

import java.io.InputStream;

/**
 * 提供资源的访问
 * @author 灭霸詹
 *
 */
public interface Resource {

	InputStream getInputStream();
}
