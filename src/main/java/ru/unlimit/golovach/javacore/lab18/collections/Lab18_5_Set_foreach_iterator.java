package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lab18_5_Set_foreach_iterator {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>(Arrays.asList("A", "B", "A"));

//		for(String s: set){
//			System.out.println(s);
//		}
		
		//верхняя конструкция на самом деле разворачивается в нижнюю конструкцию
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String elem=it.next();
			System.out.println(elem);
		}
	}

}
