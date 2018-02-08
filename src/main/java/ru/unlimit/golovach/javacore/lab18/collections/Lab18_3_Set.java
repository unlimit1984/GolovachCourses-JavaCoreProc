package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab18_3_Set {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("A", "B", "A");
		Set<String> set=new HashSet<>(list);

		System.out.println(list);
		System.out.println(set);
	}

}
