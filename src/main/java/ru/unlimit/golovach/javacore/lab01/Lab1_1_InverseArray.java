package ru.unlimit.golovach.javacore.lab01;

import java.util.Arrays;

//Инверсия массива
public class Lab1_1_InverseArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));

		int length=a.length;
		int[] b = new int[length]; 
		for(int i = 0; i < a.length; i++){
			b[i] = a[length-1-i];
		}
		a=b;

		System.out.println(Arrays.toString(a));

		
		
		
	}

}
