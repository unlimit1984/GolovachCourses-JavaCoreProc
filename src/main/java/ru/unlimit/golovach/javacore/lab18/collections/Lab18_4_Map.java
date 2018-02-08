package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab18_4_Map {

	public static void main(String[] args) {
		
//		Map<String,Integer> map=new HashMap<>();
//		map.put("A", 1);
//		map.put("BB", 10);
//		map.put("CCC", 100);
//		map.put("BB", 1000);
//		map.put("E", 1);

//		Map<String,List<Integer>> map=new HashMap<>();
//		map.put("A", Arrays.asList(1,2));
//		map.put("B", Arrays.asList(50));
//		map.put("C", Arrays.asList(2,6,99,21));
		
		
		
		Map<String,Map<String, List<Integer>>> map = new HashMap<>();

		Map<String, List<Integer>> valueA=new HashMap<>();
		valueA.put("A", asList());
		valueA.put("B", Arrays.asList(10));
		map.put("book1", valueA);
		
		Map<String, List<Integer>> valueB=new HashMap<>();
		valueB.put("AAA", Arrays.asList(4,5,7));
		valueB.put("BBB", Arrays.<Integer>asList());
		map.put("book2", valueB);
		
		System.out.println(map);
	}

	private static List<Integer> asList() {
		return Arrays.asList(1,2);
	}

}
