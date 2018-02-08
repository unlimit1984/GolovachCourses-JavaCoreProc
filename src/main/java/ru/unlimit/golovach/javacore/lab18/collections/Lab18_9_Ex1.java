package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lab18_9_Ex1 {
	
	public static void main(String[] args) {
		
		//Понять фишку, она простая, но сразу не видно
//		List<String> listA = Arrays.asList("A", "B", "C");
//		List<Integer> listB = Arrays.asList(1, 2, 3);
//		
//		for(Iterator<String> iterA=listA.iterator(); iterA.hasNext();){
//			for(Iterator<Integer> iterB=listB.iterator(); iterB.hasNext();){
//				System.out.println(iterA.next()+" "+iterB.next());
//				
//			}
//		}
		
		//тоже косяк
//		List<String> listA = Arrays.asList("A", "B");
//		List<Integer> listB = Arrays.asList(1, 2, 3);
//		
//		for(Iterator<String> iterA=listA.iterator(); iterA.hasNext();){
//			for(Iterator<Integer> iterB=listB.iterator(); iterB.hasNext();){
//				System.out.println(iterA.next()+" "+iterB.next());
//				
//			}
//		}
		
		//Лечение
		List<String> listA = Arrays.asList("A", "B","C");
		List<Integer> listB = Arrays.asList(1, 2, 3);
		
		for(Iterator<String> iterA=listA.iterator(); iterA.hasNext();){
			String s = iterA.next();
			for(Iterator<Integer> iterB=listB.iterator(); iterB.hasNext();){
				System.out.print(s+iterB.next()+" ");
			}
			System.out.println();
		}		
	}
}
