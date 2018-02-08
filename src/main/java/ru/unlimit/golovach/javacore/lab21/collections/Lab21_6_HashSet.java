package ru.unlimit.golovach.javacore.lab21.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Lab21_6_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("A");
		set.add(""+set.remove("A"));
		set.add("B");
		set.add("C");
		set.addAll(set);
		set.addAll(new ArrayList<>(set));
		set.add(set.iterator().next()+set.iterator().next());
		
		System.out.println(set);

	}

}
