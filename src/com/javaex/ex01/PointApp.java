package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {
		
		
		//Object 클래스가 있어?
		Object obj = new Object();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));
		System.out.println("============================");
		
		Object obj01 = new Object();
		Object obj02 = new Object();
		//Object obj03 = new Object();
		
		//getClass()
		System.out.println("obj.getClass()");
		System.out.println(obj.getClass());
		System.out.println("============================");

		//getClass()
		System.out.println("obj.hashCode()");
		System.out.println(obj.hashCode());
		System.out.println("============================");

		//equals() > 객체가 같은지 비교 vs ==
		System.out.println("obj.equals()");
		System.out.println(obj01.equals(obj01));
		System.out.println(obj01.equals(obj02));
		System.out.println(obj01==obj01);
		System.out.println("============================");
		
		
		
	}
	
		
}
