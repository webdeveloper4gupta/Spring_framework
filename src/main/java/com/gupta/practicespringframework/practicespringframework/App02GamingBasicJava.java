package com.gupta.practicespringframework.practicespringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gupta.practicespringframework.practicespringframework.game.GameRunner;
import com.gupta.practicespringframework.practicespringframework.game.MarioGame;
import com.gupta.practicespringframework.practicespringframework.game.PacmanGame;
import com.gupta.practicespringframework.practicespringframework.game.SuperContraGame;
//this is a jvm
//inside this we run the spring context
public class App02GamingBasicJava {
     public static void main(String[] args) {
//now launch the spring context/spring container
    	 var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//    	configuration the things that we want Spring to manage @Configuration --->this annotation represent the class is managed by the spring context
    	System.out.println(context.getBean("name")); // general syntax is context.getBean("methodname");
    	 System.out.println(context.getBean("age"));
    	 System.out.println(context.getBean("person"));
    	 System.out.println(context.getBean("address2"));
//    	 we can write bean name or bean type  
    	 System.out.println(context.getBean(Address.class));
    	 System.out.println(context.getBean("person3"));
//    	 here i list all the bean 
    	 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
