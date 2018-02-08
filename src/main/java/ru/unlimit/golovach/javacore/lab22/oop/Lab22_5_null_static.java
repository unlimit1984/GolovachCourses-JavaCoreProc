package ru.unlimit.golovach.javacore.lab22.oop;

public class Lab22_5_null_static {

	public static void main(String[] args) {

		StaticField ref = null;
		System.out.println(ref.s);
		//System.out.println(ref.s0);//расскоментируй и почувствуй разницу
		
	}
}

class StaticField{
	static String s = "static";
	String s0 = "default";
}