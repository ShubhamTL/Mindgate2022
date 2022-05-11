package com.mindgate.pojo;

public class B extends A{
	public B() {
		System.out.println("hello");
	}
	
	public B(int x){
		super(x);
		System.out.println("hello"+x);
	}
	
//	@Override
//	public void display() {
//		super.display();
//		System.out.println("hello");
//	}
	
	
	
//public void print() {
//	System.out.println("in class b prit()");
//	A a= new A();
//	a.display();

}
