package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	
	
	public Point() {}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		//a.x==b.x && a.y==b.y; (근데 이젠 이건 넘 한정적인.,.)
		//직접캐스팅 혹은
		//Point p = (Point)obj; 먼저 선언.
		if(this.x==((Point)obj).x && this.y==((Point)obj).y) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	

}
