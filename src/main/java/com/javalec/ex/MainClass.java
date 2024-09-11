package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		
		//스프링 => Ioc 컨테이너
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		Student student = (Student)ctx.getBean("student");
		Student student2 = (Student)ctx.getBean("student2");
		Student student3 = ctx.getBean("student3", Student.class);
		
		//student.setAge(10);
		//student.setName("홍길동");
		
		student.getGrade().setKor(70);
		student.getGrade().setEng(80);
		student.getGrade().setMath(90);
		
		System.out.println(student.getAge() + ":" + student.getName() + ":" + student.getGrade().getKor());
		//System.out.println(student2.getAge() + ":" + student2.getName() + " : " + "국어:" + student.getGrade().getKor() + ", " + "영어:" + student.getGrade().getEng() + ", " + "수학:" + student.getGrade().getMath());
		System.out.println(student3.getAge() + ":" + student3.getName());
		System.out.println(student3.getHobbys());
		
		System.out.println(student2.getGrade().getAvg() + ":" + student2.getGrade().getGrade() + "입니다.");
		
		//MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		//myInfo.getInfo();
		
		ctx.close();
		
	}
	
}
