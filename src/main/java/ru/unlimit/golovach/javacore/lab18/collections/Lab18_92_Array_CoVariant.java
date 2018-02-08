package ru.unlimit.golovach.javacore.lab18.collections;

public class Lab18_92_Array_CoVariant {

	public static void main(String[] args) {

		String[] strArr = { "A", "B", "C" };
		
		Object[] objArr=strArr;
		
		objArr[0]=new Integer(22);
		
		String s = strArr[0];

	}
}
