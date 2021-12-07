package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {

		Integer i = new Integer(10 ); //생성자 초기값 10
		System.out.println(i);
		
		Short s = new Short((short)15);
		//3이 인티저라 강제형변환
		Byte b = new Byte((byte)13);
		System.out.println(s);
		System.out.println(b);
		
		System.out.println("======================");
		
		int num01 = 12;
		int num02 = 9;
		int sum = num01 + num02;
		System.out.println(sum);
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(13);
		Integer result = i01 + i02;
		System.out.println(result);
		
		System.out.println("======================");

		//문자열 > int
		/*
		Integer i05 = 943;
		int r01 = i05.parseInt("12345");
		//static으로 올라감
		System.out.println(r01);
		*/
		
		int r01 = Integer.parseInt("943");
		System.out.println(r01);
		
		System.out.println("======================");
		
		//int > 문자열
		/*
		String a = "안녕하세요";
		String str01 = a.valueOf(555);
		System.out.println(str01);
		*/
		String str01 = String.valueOf(553);
		System.out.println(str01);
		
		System.out.println("다섯시오십삼분의"+553);
		String str02 = "개와늑대의시간"+553;
		System.out.println(str02);
		String str03 = ""+518;
		System.out.println(str03);
	
		
		
		

	}

}
