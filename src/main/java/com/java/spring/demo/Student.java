package com.java.spring.demo;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableListableBeanFactory.SCOPE_PROTOTYPE, proxyMode =ScopedProxyMode.TARGET_CLASS)
public class Student {
	
	private String name;
	
	public Student() {
		System.out.println("Inside Student class ...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
