package ru.unlimit.golovach.javacore.lab05.exceptions;

public class Lab5_1_Illegal {

	public static void main(String[] args) {
		int a=-5;
		int b=7;
		int area=area(a,b);

	}
	public static int area(int a, int b){
		if(a<0 || b<0)
			throw new IllegalArgumentException("a или b меньше 0, a="+a+",b="+b);
		return a*b;
	}

}
