package ru.unlimit.golovach.javacore.lab01;
//Утилита для работы с массивами
public class Lab1_ArrayUtil {
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
	}
}
