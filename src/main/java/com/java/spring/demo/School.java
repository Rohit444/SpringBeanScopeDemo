package com.java.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component("school")
@Scope(value = ConfigurableListableBeanFactory.SCOPE_SINGLETON)
public class School {
	
	@Autowired
	private Student student;    // It will get a proxy object of student, when the School class is being
								// instantiated and when the when the dependency of student class is injected
								// inside School class it always injects proxy object because in student class
								// we put proxyMode =ScopedProxyMode.TARGET_CLASS

	School(){
		System.out.println("Inside School Class ..");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
