package ru.unlimit.golovach.javacore.lab01;

import java.util.Arrays;

public class Lab1_5_1_BinarySearch {

	public static void main(String[] args) {
		//int [] a = {1,2,3,5,7,11,28,33,456,3321,94949};
		//int [] a = {6};
		int [] a = {1,2,3,5,7,11,28,33,44,456,3321,94949};
		System.out.println(Arrays.toString(a));
		
		//int search_index=binarySearch(a,0,a.length-1,44);
		int search_index=binarySearchCoursera(a,0,a.length-1,-1);

		System.out.println(search_index);
		//System.out.println(Arrays.binarySearch(a, 0, a.length-1, 400000));
		//System.out.println(Arrays.binarySearch(a, 0));
	}
	//Моя реализация
	public static int binarySearch(int[] a, int lo, int hi, int value){
		if(a.length==0)
			return -1;
		if(a.length==1){
			if(	a[0]==value)
				return 0;
			else if(a[0]>value)
				return -1;
			else
				return -2;
		}
		
		while(hi-lo>1){
			int mid=lo+(hi-lo)/2;
			if(a[mid]>value){
				hi=mid;
			}
			else if(a[mid]<value){
				lo=mid;
			}
			else{
				return mid;
			}
		}
		
		if(value<a[lo]){		//слева
			return lo-1;
		}
		else if(value<a[hi]){	//между
			return -hi-1;
		}
		else{// (value>a[hi]){ 	//справа
			return -hi-2;
		}
	}
	//Из coursera.org намного красивее
	public static int binarySearchCoursera(int[] a, int lo, int hi, int value){
		int low = 0;
		int high = hi;
		int mid;
		while (low <= high) {
			mid = low + ((high-low)/2);
			int compare = value - a[mid];
			if (compare < 0) {
				high = mid - 1;
			}
			else if (compare > 0) {
				low = mid+1;
			}
			else return mid;
		}
		return -1; 
	}
}
