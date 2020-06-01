package com.alibaba.springframework.beans.config;

import java.io.InputStream;

/**
 * 提供资源的访问
 * @author shenmeng
 *
 */
public interface Resource {

	InputStream getInputStream();
}
