package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab18_8_WrongIterator {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>(Arrays.asList("AAA", "BBB", "CCC"));
		
		Iterator<String> iter = set.iterator();
		
		//нельзя удалять элементы из коллекции во время прохода через итератор
//		while(iter.hasNext()){
//			String elem = iter.next();
//			if(elem.startsWith("B")){
//				set.remove(elem);
//			}
//		}
		
		//можно удалять используя только сам итератор
		while(iter.hasNext()){
			String elem = iter.next();
			if(elem.startsWith("B")){
				iter.remove();
			}
		}
		
		System.out.println(set);
	}
		
}
