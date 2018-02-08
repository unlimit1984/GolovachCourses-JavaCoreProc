package ru.unlimit.golovach.javacore.lab02;

public class Lab2_2_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1);
	}
	private static void f(int k) {
		System.out.println(k++);

//		long l1=0;
//		long l2=0;
//		long l3=0;
//		long l4=0;
//		long l5=0;
//		long l6=0;
//		long l7=0;
//		long l8=0;
//		long l9=0;
		f(k);
		
	}
}
