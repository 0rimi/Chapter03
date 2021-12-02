package com.javaex.ex04;

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
	
	//부모 Object의 equals 재정의
	public boolean equals(Object obj) {
		//만약 가로세로가 같다면~
		if(this.width==((Rectangle)obj).width
				&& this.height==((Rectangle)obj).height) {
			return true;	
		}
		else {
			return false;
		}
		
	}
	
	
	
	
	

}
