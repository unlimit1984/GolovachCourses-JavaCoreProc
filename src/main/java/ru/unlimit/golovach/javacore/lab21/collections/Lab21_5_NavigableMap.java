package ru.unlimit.golovach.javacore.lab21.collections;

import java.util.HashSet;
import java.util.NavigableMap;
import java.util.TreeMap;

//Пример еще не готов
public class Lab21_5_NavigableMap {

	public static void main(String[] args) {
		NavigableMap<String,Integer> map = new TreeMap<>();
		map.put("A", 0);
		map.put("B", 1);
		map.put("C", 0);
		map.put("B", 3);
		
		map.put(map.lastKey(), map.get(map.lastKey()+1));
		System.out.println(map);
		System.out.println(new HashSet<>(map.keySet().size()));
		System.out.println(new HashSet<>(map.values().size()));

	}

}
