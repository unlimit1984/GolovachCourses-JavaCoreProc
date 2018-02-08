package ru.unlimit.golovach.javacore.lab22.oop;

public class Lab22_1_ParentChild {

	public static void main(String[] args) {
		
		Parent p = new Child();
		System.out.println(p);
		
		

	}

}

class Parent{

	public String toString() {
		return "Parent";
	}
}

class Child extends Parent{

	@Override
	public String toString() {
		return "Child";
	}
}