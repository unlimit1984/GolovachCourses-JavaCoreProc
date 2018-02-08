package ru.unlimit.golovach.javacore.lab22.oop;

public class Lab22_2_ParentChild_static {

	public static void main(String[] args) {
		
		ParentStatic p = new ChildStatic();
		p.print();
		
		funcParent(p);
		//funcChild(p);
		
		ChildStatic p2 = new ChildStatic();
		p2.print();
		
		funcParent(p2);
		funcChild(p2);
		

	}

	public static void funcParent(ParentStatic p){
		p.print();
	}
	public static void funcChild(ChildStatic p){
		p.print();
	}
}

class ParentStatic{

	public static void print() {
		System.out.println("Parent");
	}
}

class ChildStatic extends ParentStatic{

	public static void print() {
		System.out.println("Child");
	}
}