package com.java.spring.demo;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletonDemo")
@Scope(value = ConfigurableListableBeanFactory.SCOPE_SINGLETON)
public class SingletonDemo {

}
