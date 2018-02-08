package ru.unlimit.golovach.javacore.lab01;

import java.util.Arrays;

//Алгоритм сортировки вставками
public class Lab1_5_2_SortInserting {

	public static void main(String[] args) {
		//sortInserting();

		//sortGolovach();
		
		sortGolovachAdvanced();
	}
	//Добавить бинарный поиск binarySearch и arraycopy
	private static void sortGolovachAdvanced() {
		int [] arr = {6,5,22,2,8,9,2,36,35,2,1,99,0};
		
		
		System.out.println(Arrays.toString(arr));
		
		for(int barier = 1; barier < arr.length; barier++){
			int newElement = arr[barier];
			int pos=Arrays.binarySearch(arr, 0, barier, newElement);
			if(pos<0){
				pos=-(pos+1);
			}
			if(pos!=barier){
				System.arraycopy(arr, pos, arr, pos+1, barier-pos);
				arr[pos]=newElement;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void sortGolovach() {
		int [] arr = {6,5,22,2,8,9,2,36,2,1,99,0};
		
		System.out.println(Arrays.toString(arr));
		
		for(int barier = 1; barier < arr.length; barier++){
			int newElement = arr[barier];
			int index=barier-1;
			while(index >= 0 && arr[index] > newElement){
				arr[index+1]=arr[index];
				index--;
			}
			arr[index+1]=newElement;
		}
		System.out.println(Arrays.toString(arr));
		
	}

	private static void sortInserting() {
		int [] a = {6,5,22,2,8,9,2,36,2,1,99,0};
		
		System.out.println(Arrays.toString(a));
		
		for(int barier = 1; barier < a.length; barier++){
			int index=barier;
			while(index-1>=0 && a[index]<a[index-1]){
				Lab1_ArrayUtil.swap(a, index, index-1);
				index--;
			}
		}

		System.out.println(Arrays.toString(a));
	}

}
