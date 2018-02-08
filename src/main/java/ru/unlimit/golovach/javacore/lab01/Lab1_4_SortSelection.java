package ru.unlimit.golovach.javacore.lab01;

import java.util.Arrays;

//Алгоритм сортировки выборками
public class Lab1_4_SortSelection {

	public static void main(String[] args) {
		
		//simpleSort();
		//advancedSort1();
		advancedSort2();
		
		
	}
	//Сортировка выборками
	private static void simpleSort() {
		int [] a = {5,2,8,9,2,2,1,99,0};
		
		System.out.println(Arrays.toString(a));
		
		for(int barier=0; barier<a.length-1; barier++){
			for(int i=barier+1;i<a.length;i++){
				if(a[i]<a[barier]){
					Lab1_ArrayUtil.swap(a,i,barier);
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	//Продвинутая - в первом цикле сохраняем барьерный элемент, КОСЯК, загуглить
	//после второго чтения косяка не нашел
	//но кажется понял, что сохранять барьерный элемент нужно,
	//чтобы каждый раз не вытаскивать его из массива без лишней необходимости
	private static void advancedSort1() {
		int [] a = {6,5,22,2,8,9,2,36,2,1,99,0};
		
		System.out.println(Arrays.toString(a));
		
		for(int barier=0; barier<a.length-1; barier++){
			int elem_barier=a[barier];
			for(int i=barier+1;i<a.length;i++){
				if(a[i]<elem_barier){
					Lab1_ArrayUtil.swap(a,i,barier);
					elem_barier=a[barier];
				}					
			}
		}
		System.out.println(Arrays.toString(a));
	}
	//Оптимизация за счет поиска наименьшего элемента в внутреннем цикле
	//после внутреннего цикла меняем местами барьерный элемент и минимальный, если не воспали
	private static void advancedSort2() {
		int [] a = {5,2,8,9,2,2,1,99,0};
		//int [] a = {3,2,1};
		System.out.println(Arrays.toString(a));
		
		for(int barier=0; barier<a.length-1; barier++){
			int index_min=barier;
			for(int i=barier+1;i<a.length;i++){
				if(a[i]<a[index_min]){
					index_min=i;
				}
			}
			if(barier != index_min)
				Lab1_ArrayUtil.swap(a,index_min,barier);			
		}
		System.out.println(Arrays.toString(a));
	}	

}
