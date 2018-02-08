package ru.unlimit.golovach.javacore.lab21.collections;

import java.util.HashMap;
import java.util.Map;

public class Lab21_3_Map {

	public static void main(String[] args) {
		
		Map<String, Map<String, String>> map = new HashMap<>();
		map.put("A", map("A","A"));
		map.put("B", map("A","B"));
		map.put("C", map("C","A"));
		map.put("A", map("C","B"));
		
		System.out.println(map.get("A").get("A"));

	}

	public static <K,V> Map<K,V> map(K key, V value){
		Map<K,V> map = new HashMap<>();
		map.put(key, value);
		return map;
	}
}
