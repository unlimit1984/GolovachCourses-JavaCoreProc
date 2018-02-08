package ru.unlimit.golovach.javacore.lab24.oop;

public class Lab24_6_fields {

	public static void main(String[] args) {
		
		

	}
}
//class OuterX{
//	private int x;
//	class Innner{
//		void f(){
//			System.out.println(x*x);
//		}
//	}
//}

//class OuterX{
//	private int x;
//	static class Innner{
//		void f(){
//			System.out.println(x*x);
//		}
//	}
//}

class OuterX{
	static private int x;
	static class Innner{
		void f(){
			System.out.println(x*x);
		}
	}
}
