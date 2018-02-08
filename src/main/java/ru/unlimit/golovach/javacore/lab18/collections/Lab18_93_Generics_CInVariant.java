package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Arrays;
import java.util.List;

public class Lab18_93_Generics_CInVariant {

	public static void main(String[] args) {

		//Будет ошибка
//		List<String> strArr = Arrays.asList("A", "B", "C");
//		List<Object> objArr = strArr;
//		objArr.set(0, new Integer(0));
//		String s = strArr.get(0);

		
		//Но можно так, тогда упадет позже, во время записи
		List<String> strArr = Arrays.asList("A", "B", "C");
		List<? extends Object> objArr = strArr;
//		objArr.set(0, new Integer(0));
//		String s = strArr.get(0);
		
	}
}
