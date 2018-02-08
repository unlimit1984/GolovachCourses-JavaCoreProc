package ru.unlimit.golovach.javacore.lab21.collections;

import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Lab21_2_NavigableSet_Comparable {

	public static void main(String[] args) {
		NavigableSet<Person1> set = new TreeSet<Person1>();
		set.add(new Person1("Dan",20));
		set.add(new Person1("Anna",25));
		set.add(new Person1("Anna",20));
		set.add(new Person1("Mike",45));
		set.add(new Person1(null,10));
		//set.add(new Person(null,10));
		System.out.println(set);
		System.out.println(set.contains(new Person1("Anna",20)));
		System.out.println(set.descendingIterator().next());
		//тоже самое
		System.out.println(set.descendingSet().iterator().next());
	}
}
class Person1 implements Comparable<Person1>{
	String name;
	int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person1 o) {
		int result=age-o.age;
		if(result!=0){
			return result;
		}
		else{
			return name.compareTo(o.name);
		}
		//return 0;
	}

	
	//реализация equals не требуется, compare достаточно
//	@Override
//	public boolean equals(Object obj) {
//	    if (obj == this)
//	        return true;

//		if(obj == null)
//			return false;
//		
//		if(!(obj instanceof Person))
//			return false;
//		
//		Person that = (Person) obj;
//		if(age!=that.age)
//			return false;
//		
//		if(!Objects.equals(name, that.name))
//			return false;
//		
//		return true;
//		
//	}
}