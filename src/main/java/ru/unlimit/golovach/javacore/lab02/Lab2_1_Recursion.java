package ru.unlimit.golovach.javacore.lab02;

public class Lab2_1_Recursion {

	public static void main(String[] args) {

		f(1);

	}
	


	public static void f(long k){
		System.out.println(" "+k);
		if(k<17){
			f(2*k);
		}
		System.out.print(" "+k);
	}

}
