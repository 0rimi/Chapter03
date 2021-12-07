package com.javaex.ex06;

public class String01 {
	
	public static void main(String[] args){
		
		String str01 = new String("hi");
		String str02 = new String("hi");
		
		System.out.println(str01==str02);
		//주소가 다르니까 무좍건 다름
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		//해쉬코드가 같네? 해쉬코드는 주소를 의미하는건 아님.
		
		System.out.println(str01.equals(str02));
		
		System.out.println("======================");
		
		String str03 = "hello";
		String str04 = "hello";
		
		System.out.println(str03==str04);
		//그냥 있는 hello찾아다쓴거라서 같은걸로 봄
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		
		str03 = "hello!!!!";
		System.out.println(str03);
		System.out.println(str04);
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		//해쉬코드 재정의됨
		
		System.out.println("======================");
		
		System.out.println(str03.toString());
		//toString 재정의 됨		
		
	}

}
