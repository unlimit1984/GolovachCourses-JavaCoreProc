package ru.unlimit.golovach.javacore.lab02;

import java.util.Arrays;

import ru.unlimit.golovach.javacore.lab01.Lab1_ArrayUtil;

//Задача о генерации всех перестановок
public class Lab2_5_Permutation {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		
		permutation(arr, arr.length);
		//permutation2(arr, arr.length);

	}
	public static void permutation(int[] arr,int size){
		//Неправильное решение
//		if(size < 2){
//			System.out.println(Arrays.toString(arr));
//		}
//		else{
//			for(int k = 0; k < size; k++){
//				Lab1_ArrayUtil.swap(arr, k, size-1);
//				permutation(arr, size-1);
//			}
//		}
		
		//Правильное решение (в предыдущем обмене криво делался обмен для двух элементов)
		if(size<2){
			System.out.println(Arrays.toString(arr));
		}
		else{
			for(int i=0;i<size;i++){
				int last = arr[size-1];
				System.arraycopy(arr, 0, arr, 1, size-1);
				arr[0]=last;
				permutation(arr, size-1);
			}
		}
	}
	public static void permutation2(int[] arr,int size){
		if(size<2){
			System.out.println(Arrays.toString(arr));
		}
		else{
			for(int i=arr.length-size;i<arr.length;i++){
				int last = arr[arr.length-1];
				System.arraycopy(arr, arr.length-size, arr, arr.length-size+1, size-1);
				arr[arr.length-size]=last;
				permutation2(arr, size-1);
			}
		}		
	}

}
