package com.example.demo.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context	=new ClassPathXmlApplicationContext("beans.xml");
	Employee bean = (Employee) context.getBean("emp1");
	System.out.println(bean);

	}

}
