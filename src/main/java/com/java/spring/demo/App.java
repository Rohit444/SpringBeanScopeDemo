package com.java.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.spring.demo.config.Config;
import com.java.spring.demo.config.Config2;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
		School school1 = context1.getBean("school", School.class);
		School school2 = context1.getBean("school", School.class);
		
		System.out.println("School Objects from contex1 : "+school1+" <---> "+school2);
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(Config.class);
		School school3 = context2.getBean("school", School.class);
		School school4 = context2.getBean("school", School.class);
		
		System.out.println("School Objects from contex2 : "+school3+" <---> "+school4);
	
		
//		Student obj1 = context.getBean("student", Student.class);
//		obj1.setName("Rohit Sharma");
//		Student obj2 = context.getBean("student", Student.class);
//		
//		System.out.println(obj1.getName());
//		System.out.println(obj2.getName());
		
//		School school1 = context.getBean("school", School.class);
//		//School school2 = context.getBean("school", School.class);
//		
//	    
//	    Student student1 = school1.getStudent();
//	    Student student2 = school1.getStudent();
//	    
//	    System.out.println("Student1 "+student1);
//	    System.out.println("Student2 "+student2);
	    
	}

}
