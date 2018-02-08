package ru.unlimit.golovach.javacore.lab22.oop;

public class Lab22_6_Constructors {

	public static void main(String[] args) {
		
		B b = new B();
		
	}	
}

class A{
	public A(){
		System.out.println("A default constructor");
	}
	public A(int i){
		System.out.println("A 2-constructor");
	}
}

class B extends A{
	
}