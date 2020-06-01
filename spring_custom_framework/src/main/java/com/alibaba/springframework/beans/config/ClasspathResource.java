package com.alibaba.springframework.beans.config;

import java.io.InputStream;

public class ClasspathResource implements Resource {

	private String location;

	public ClasspathResource(String location) {
		this.location = location;
	}

	@Override
	public InputStream getInputStream() {
		return this.getClass().getClassLoader().getResourceAsStream(location);
	}

}
