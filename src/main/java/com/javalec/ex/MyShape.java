package com.javalec.ex;

public class MyShape {
	
	Shape shape = null;
	
	int firstNum;
	int secondNum;
	
	public void triangleArea() {
		shape.getTriArea(firstNum, secondNum);
	}
	
	public void revtanrgleArea() {
		shape.getRecArea(firstNum, secondNum);
	}
	
	public MyShape() {}
	
	public Shape getShape() {
		return shape;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	
	
	
}
