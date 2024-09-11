package com.javalec.ex;

public class Shape {
	
	public Shape() {}
	
	public void getTriArea(int first, int secound) {
		System.out.println("getTriArea()");
		int tArea = (first + secound)/2	;
		System.out.println("삼각형의 넓이는 " + tArea);
	}
	
	public void getRecArea(int first, int secound) {
		System.out.println("getRecArea()");
		int rArea = first * secound;
		System.out.println("사각형의 넓이는 " + rArea);
	}
	
}
