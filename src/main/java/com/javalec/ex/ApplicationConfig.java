package com.javalec.ex;

import org.springframework.context.annotation.Bean;



public class ApplicationConfig {
	
	//<bean id="student1" class="com.javalec.ex.Student"></bean>
	
	@Bean
	public Student student1() {
		Student student = new Student("홍길동",25);
		return student;
	}
	
	@Bean
	public Student student2() {
		Student student = new Student("홍길순",33);
		return student;
	}

}
