package ru.unlimit.golovach.javacore.lab01;

import java.util.Arrays;

//Алгоритм сортировки пузырьком
public class Lab1_2_SortBubble {

	public static void main(String[] args){
		int[] arr = {3,2,1};
		System.out.println(Arrays.toString(arr));
		sortBubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sortBubble(int[] arr){
		
		for(int barier=arr.length-1;barier>=0;barier--){
			for(int i=0;i<barier;i++){
				if(arr[i]>arr[i+1])
					Lab1_ArrayUtil.swap(arr,i,i+1);
			}
		}
	}

}
