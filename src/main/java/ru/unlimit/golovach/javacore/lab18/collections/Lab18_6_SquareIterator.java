package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Iterator;

public class Lab18_6_SquareIterator {

	public static void main(String[] args) {
		
		
		Iterator<Integer> it=new SquareIterator();
		for(int k=0;k<1000;k++){
			System.out.println(it.next());
		}

	}

}
