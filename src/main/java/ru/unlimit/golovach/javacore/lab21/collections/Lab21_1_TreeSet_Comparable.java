package ru.unlimit.golovach.javacore.lab21.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Lab21_1_TreeSet_Comparable {

	public static void main(String[] args) {
		Set<Person> set = new TreeSet<Person>();
		set.add(new Person("Dan",20));
		set.add(new Person("Dan",20));
		set.add(new Person("Anna",25));
		set.add(new Person("Anna",20));
		set.add(new Person("Mike",45));
		set.add(new Person(null,10));
		set.add(new Person(null,10));
		System.out.println(set);
		System.out.println(set.contains(new Person("Anna",20)));
		
//		Set<Person> hs = new HashSet<Person>();
//		hs.add(new Person("Vova", 30));
//		hs.add(new Person("Ivan", 25));
//		hs.add(new Person("Ivan", 25));
//		System.out.println(hs);
		
		
	}
}
class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		int result=age-o.age;
		if(result!=0){
			return result;
		}
		//name тоже нужно сравнивать,
		//иначе не будут добавляться люди с одинаковым возрастом,
		//но с другими именами
		else{
			return name.compareTo(o.name);
		}
		//return 0;
	}

//	@Override
//	public int hashCode() {
//		int result = 7;
//		result = 31*result+age;
//		result = 31*result + (name==null ? 0 : name.hashCode());
//		return result;
//	}

	
	//реализация equals не требуется, compare достаточно
//	@Override
//	public boolean equals(Object obj) {
//	    if (obj == this)
//	        return true;
//
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