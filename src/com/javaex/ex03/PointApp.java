package com.javaex.ex03;

public class PointApp {
	
	public static void main(String[] args) {
		
		
		Point a = new Point(3,4);
		Point b = new Point(3,4);
		Point c = new Point(8,22);
		
		Point d = c;
		
		System.out.println(a==b);
		System.out.println(c==d);
		
		System.out.println("=======================");
		System.out.println(a.equals(b));
		
	}
	
}
