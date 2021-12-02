package com.javaex.ex04;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle r01 = new Rectangle(5,53);
		Rectangle r02 = new Rectangle(5,53);
		Rectangle r03 = new Rectangle(9,43);
		
		
		System.out.println(r01.equals(r02));
		System.out.println(r01.equals(r03));
		
	}

}
