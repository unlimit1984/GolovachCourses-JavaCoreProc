package ru.unlimit.golovach.javacore.lab20.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Lab20_2_PersonA {

	public static void main(String[] args) {
		//Запустить тоже самое, снеся equals у PersonA
//		Collection<PersonA> coll = new ArrayList<>();
//		coll.add(new PersonA("Mike", 45));
//		System.out.println("coll = "+coll);
//		System.out.println("contains : "+coll.contains(new PersonA("Mike", 45)));
//		System.out.println("remove : "+coll.remove(new PersonA("Mike", 45)));
//		System.out.println("coll = "+coll);
//		System.out.println("contains : "+coll.contains(new PersonA("Mike", 45)));
//		System.out.println("remove : "+coll.remove(new PersonA("Mike", 45)));

	
//		Collection<PersonA> coll = new HashSet<>();
//		coll.add(new PersonA("Mike", 45));
//		coll.add(new PersonA("Mike", 45));
//		System.out.println("coll = "+coll);
//		System.out.println("contains : "+coll.contains(new PersonA("Mike", 45)));
//		System.out.println("remove : "+coll.remove(new PersonA("Mike", 45)));
//		System.out.println("coll = "+coll);
//		System.out.println("contains : "+coll.contains(new PersonA("Mike", 45)));
//		System.out.println("remove : "+coll.remove(new PersonA("Mike", 45)));
	
		Collection<String> coll = new HashSet<>();
		coll.add("Mike-45");
		System.out.println("coll = "+coll);
		System.out.println("contains : "+coll.contains("Mike-45"));
		System.out.println("remove : "+coll.remove("Mike-45"));
		System.out.println("coll = "+coll);
		System.out.println("contains : "+coll.contains("Mike-45"));
		System.out.println("remove : "+coll.remove("Mike-45"));		

		//тоже самое
//		Collection<String> coll = new HashSet<>();
//		coll.add(new String("Mike-45"));
//		System.out.println("coll = "+coll);
//		System.out.println("contains : "+coll.contains(new String("Mike-45")));
//		System.out.println("remove : "+coll.remove(new String("Mike-45")));
//		System.out.println("coll = "+coll);
//		System.out.println("contains : "+coll.contains(new String("Mike-45")));
//		System.out.println("remove : "+coll.remove(new String("Mike-45")));
	}

}
