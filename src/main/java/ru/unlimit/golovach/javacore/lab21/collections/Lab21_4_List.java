package ru.unlimit.golovach.javacore.lab21.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Lab21_4_List {

	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<>();
		list.add(list.add(false));
		
		System.out.println(list);
		System.out.println(new HashSet<>(list).size());
	}

}
