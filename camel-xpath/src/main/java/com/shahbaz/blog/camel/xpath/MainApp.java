package com.shahbaz.blog.camel.xpath;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	 public static void main(final String[] args) throws Exception {
		 new ClassPathXmlApplicationContext("application-context.xml");
		 Thread.sleep(5000);
		 }

}
