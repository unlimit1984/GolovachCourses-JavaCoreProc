package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lab18_2_Set {

	public static void main(String[] args) {
		
//		Set<String> list = new HashSet<>();
//		list.add("AAA");
//		list.add("BB");
//		list.add("CC");
//		list.add("AA");
//		
//		System.out.println(list);
//		System.out.println(list.add("BB"));
//		System.out.println(list.add("DD"));
//		System.out.println(list);
		
//		Set<String> list = new HashSet<>(Arrays.asList("AA","AA","BB"));
//		System.out.println(list);
		
//		Set<String> list = new HashSet<>(Arrays.asList("AA","AA","BB"));
//		System.out.println(list);
		
		Set<String> treeSet = new TreeSet<>(Arrays.asList("BBB","AA","CCC"));
		Set<String> set = new HashSet<>(Arrays.asList("BBB","AA","CCC"));
		List<String> list = new ArrayList<>(Arrays.asList("BBB","AA","CCC"));
		
		System.out.println(treeSet);
		System.out.println(set);
		System.out.println(list);
		
		
	}

}
