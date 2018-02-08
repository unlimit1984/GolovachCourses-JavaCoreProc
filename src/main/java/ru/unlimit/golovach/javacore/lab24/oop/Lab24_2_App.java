package ru.unlimit.golovach.javacore.lab24.oop;

public class Lab24_2_App {

	class Nested1{}
	
	public Object f(){
		class Nested2{}
		return new Nested2();
	}
	
	
}
