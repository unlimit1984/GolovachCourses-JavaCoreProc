package ru.unlimit.golovach.javacore.lab19.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//Оценка скорости доступа к элементу посередине при большом массиве
public class Lab19_1_TestListGet {

	static int LIST_LENGTH = 100_000;
	static int OPERATION_COUNT = 100_000;
	
	public static void main(String[] args) {
		//INIT PARAMS
		int elem_index = LIST_LENGTH/2;		
		List<String> list = new ArrayList<>();
		//List<String> list = new LinkedList<>();
		
		//FILL
		for(int k=0; k<LIST_LENGTH; k++){
			list.add("A");
		}
		//TEST
		long startTime = System.currentTimeMillis();
		for(int k=0; k<OPERATION_COUNT; k++){
			list.get(elem_index);
		}
		long stopTime  = System.currentTimeMillis();
		System.out.println("dT: " + (stopTime-startTime));
		
		
	}

}
