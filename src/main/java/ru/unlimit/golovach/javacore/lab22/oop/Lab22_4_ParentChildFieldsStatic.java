package ru.unlimit.golovach.javacore.lab22.oop;

public class Lab22_4_ParentChildFieldsStatic {

	public static void main(String[] args) {
		
		ParentFieldStatic p = new ChildFieldStatic();
		System.out.println(p.s);
		
		print(new ChildFieldStatic());
	}
	
	
	public static void print(ParentFieldStatic p){
	//public static void print(ChildFieldStatic p){
		System.out.println(p.s);
	}

}

class ParentFieldStatic{
	static String s = "Parent";
}

class ChildFieldStatic extends ParentFieldStatic{
	static String s = "Child";
}