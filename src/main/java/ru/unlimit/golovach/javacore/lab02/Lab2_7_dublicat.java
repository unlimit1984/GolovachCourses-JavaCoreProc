package ru.unlimit.golovach.javacore.lab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lab2_7_dublicat {
	//Написать программу,
	//которая выводит все значения от 0 до 9999,
	//но в каждом числе цифра не может повторяться более одного раза
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		cycle(8);
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(estimatedTime);
		
		startTime = System.nanoTime();
		recursion(8);
		estimatedTime = System.nanoTime() - startTime;
		System.out.println(estimatedTime);	
	}
	//Первый способ циклом
	private static void cycle(int len) {
		StringBuilder sb=new StringBuilder();
		for(int p=0;p<len;p++){
			sb.append("9");
		}
		
		for(int i=0;i<=Integer.parseInt(sb.toString());i++){
			
			char[] s=String.valueOf(i).toCharArray();
			boolean good=true;
			for(int j=0;j<s.length && good;j++){
				char ch=s[j];
				for(int k=j+1;k<s.length;k++){
					if(ch==s[k]){
						good=false;
						break;
					}
				}
			}
			if(good){
				//System.out.println(i);
			}
		}
		
	}
	static List<String> list=new ArrayList<String>();
	//Второ	 способ рекурсией
	private static void recursion(int len) {
		int[] arr={0,1,2,3,4,5,6,7,8,9};
		
		for(int size=1;size<=len;size++){
			permutation2(arr,arr.length,size);		
		}
		
		List<Integer> list_int=new ArrayList<Integer>();
		
		Iterator<String> it = list.iterator();
//		while(it.hasNext()){
//			String s=it.next();
//			if(s.startsWith("0")){
//				it.remove();
//			} else{
//				list_int.add(Integer.parseInt(s));
//			}
//		}
//		if(list_int.size()>0){
//			list_int.add(0, 0);
//		}
//		Integer[]a=new Integer[list_int.size()];
//		Arrays.sort(list_int.toArray(a));
//		for(Integer val: a){
//			System.out.println(val);
//		}
		
	}
	public static void permutation2(int[] arr,int size,int length){
		if(arr.length-size==length){
			StringBuilder sb=new StringBuilder();
			for(int k=0;k<length;k++){
				sb.append(arr[k]);
			}
			list.add(sb.toString());
		}
		else{
			for(int i=arr.length-size;i<arr.length;i++){
				int last = arr[arr.length-1];
				System.arraycopy(arr, arr.length-size, arr, arr.length-size+1, size-1);
				arr[arr.length-size]=last;
				permutation2(arr, size-1,length);
			}
		}		
	}
}
