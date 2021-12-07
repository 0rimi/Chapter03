package com.javaex.ex06;

public class String02 {
	
	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg ";
		
		//toUpperCase : s대문자로 바꿔줌
		System.out.println(a.toUpperCase());

		//concat : 합쳐주는 메소드
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		
		a = a.concat(b);
		System.out.println(a);
		
		//trim : 공백(스페이스) 무시해버리는 메소드
		a = a.trim();
		System.out.println(a);
		
		//replace : 문자를 바꿔주는 메소드
		a = a.replace("ab", "sj");
		System.out.println(a);
		
		//split : 이문자(,) 기준으로 잘라달서 두개의 배열을 만듬.
		String[] sArray = a.split(",");
		System.out.println(sArray[0]);
		System.out.println(sArray[1]);
		
		//substring : 0부터 시작해서, n번째부터 보이기 시작~
		String str = "Hello JAVA!";
		String r01 = str.substring(3, 8);
		System.out.println(r01);
		
	}

}
