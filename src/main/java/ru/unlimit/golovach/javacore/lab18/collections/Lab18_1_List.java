package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab18_1_List {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.set(3, "D");
		System.out.println(list);
		System.out.println(list.get(2));
		list.add(2,"X");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.remove("XXX"));
		Collections.sort(list);
		System.out.println(list);
		
//		List<String> list = Arrays.asList("A","B","C");
//		System.out.println(list);
//		list.add("C");//Будет ошибка, т.к. Arrays.asList создает немутирующую коллекцию 
//		System.out.println(list);
		
		//Надо делать так
//		List<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
//		System.out.println(list);
//		list.add("C");//OK 
//		System.out.println(list);

		

	}

}
