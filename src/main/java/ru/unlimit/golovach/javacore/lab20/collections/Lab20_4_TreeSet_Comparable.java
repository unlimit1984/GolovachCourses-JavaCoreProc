package ru.unlimit.golovach.javacore.lab20.collections;

import java.util.Set;
import java.util.TreeSet;

public class Lab20_4_TreeSet_Comparable {

	public static void main(String[] args) {
		
		//Все оке, потому что класс String реализует Comparable
//		Set<String> set = new TreeSet<>();
//		set.add("A");
//		set.add("6");
//		set.add("C");
//		set.add("B");
//		set.add("4");
//		System.out.println(set);
		
		//Плохо, потому что PersonX не реализует Comparable
		Set<PersonX> set = new TreeSet<>();
		set.add(new PersonX("Mike", 45));
		set.add(new PersonX("Mike", 45));
		set.add(new PersonX("Ann", 18));
		set.add(new PersonX("Betty", 5));
		set.add(new PersonX("Den", 27));
		set.add(new PersonX("April", 32));
		System.out.println(set);
		
//		System.out.println("A".compareTo("C"));
//		System.out.println("E".compareTo("A"));
//		System.out.println("C".compareTo("M"));
//		System.out.println("T".compareTo("T"));
	}

}
