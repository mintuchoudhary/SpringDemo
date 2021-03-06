package com.demo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Cust obj = (Cust) context.getBean("custBean");
		obj.printCust("Customer: Telnet");
	}

}