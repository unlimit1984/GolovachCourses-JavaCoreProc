package ru.unlimit.golovach.javacore.lab22.oop;

public class Lab22_3_ParentChildFields {

	public static void main(String[] args) {
		
		ParentField p = new ChildField();
		System.out.println(p.s);
		
		print(new ChildField());
	}
	public static void print(/*ParentField*/ChildField p){//переделать в ChildField
		System.out.println(p.s);
	}

}

class ParentField{
	String s = "Parent";
}

class ChildField extends ParentField{
	//String s = "Child";//закомментить
}