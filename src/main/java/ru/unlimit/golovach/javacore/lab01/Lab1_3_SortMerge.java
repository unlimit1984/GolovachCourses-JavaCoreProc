package ru.unlimit.golovach.javacore.lab01;

import java.util.Arrays;

//Слияние двух отсортированных массивов
public class Lab1_3_SortMerge {

	public static void main(String[] args) {
		
		int a [] = {1,3,5,7,9,10,11};
		int b [] = {2,4,6,8};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int result [] = new int [a.length+b.length];
		
		int a_index=0;
		int b_index=0;
		while(a_index+b_index!=a.length+b.length){
			if(a_index == a.length){
				System.arraycopy(b, b_index, result, a_index+b_index, b.length-b_index);
				break;
			}
			if(b_index == b.length){
				System.arraycopy(a, a_index, result, b_index+a_index, a.length-a_index);
				break;
			}
			if(a[a_index]<b[b_index]){
				result[a_index+b_index] = a[a_index++];
			}
			else
				result[a_index+b_index] = b[b_index++];
		}
		
		System.out.println(Arrays.toString(result));
	}

}
