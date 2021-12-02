package com.javaex.ex05;

public class Rectangle {
	
	private int width;
	private int height;
	
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	//메소드
	public double area() {
		double result = this.height*this.width;
		return result;
	}
	
	//부모 Object의 equals 재정의
	public boolean equals(Object obj) {
		//만약 넓이가 같다면~
		if(this.area()==((Rectangle)obj).area()) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
