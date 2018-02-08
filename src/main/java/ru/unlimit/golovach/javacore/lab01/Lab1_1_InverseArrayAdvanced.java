package ru.unlimit.golovach.javacore.lab01;

import java.util.Arrays;

//Инверсия массива продвинутая
public class Lab1_1_InverseArrayAdvanced {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));

		int length=a.length;

		for(int i = 0; i <length/2; i++){
			Lab1_ArrayUtil.swap(a, i, length-1-i);
		}

		
		System.out.println(Arrays.toString(a));
		
	}

}
