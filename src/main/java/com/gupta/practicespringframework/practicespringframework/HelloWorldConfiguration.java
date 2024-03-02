package com.gupta.practicespringframework.practicespringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//to eleminate the verbosity , we make the record that comes in jdk to make java beans 
record Person(String name,int age,Address address) {
	
}
record Address(String firstLine ,String city) {
	
}

@Configuration
public class HelloWorldConfiguration {
    @Bean
	public String name() {
		return "Sukrtan gupta";
	}
    @Bean
   	public int age() {
   		return 21;
   	}
    @Bean 
    public Person person() {
    	return new Person("Sukriatn Gupta",22,new Address("ward no15","patel nagaer"));
    	
    }
    @Bean(name="address2")
    @Qualifier("address3qualifier")
    public Address address() {
    	return new Address("patel nagar","kathua");
    }
    @Bean 
    public Person person2() {
    	return new Person(name(),age(),address());
    	
    }
    @Bean 
    public Person person3(String name,int age,@Qualifier("address3qualifier") Address address2) {
    	return new Person(name,age,address2);
    	
    }
    @Primary
    @Bean(name="address3")
    public Address address3() {
    	return new Address("patel nagar","kathuanshmjh,,jj,dhbvbnmjff");
    }
}
