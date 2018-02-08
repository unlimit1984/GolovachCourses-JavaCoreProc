package ru.unlimit.golovach.javacore.lab02;

public class Lab2_3_Fib {

	public static void main(String[] args) {
		
		System.out.println(fib(10));
		System.out.println(fib_advanced(10));
	}

	public static int fib(int k){
		if(k==0 || k==1){
			return 1;
		}
		else{
			return fib(k-1)+fib(k-2);
		}
	}
	public static int fib_advanced(int k){

			return k<2?1:fib(k-1)+fib(k-2);
		}
}
