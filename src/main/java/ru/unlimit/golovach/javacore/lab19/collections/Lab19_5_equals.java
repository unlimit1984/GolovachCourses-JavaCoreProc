package ru.unlimit.golovach.javacore.lab19.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Lab19_5_equals {

	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<>();
//		list.add("A");
//		System.out.println(list.contains("A"));

//		List<List<String>> list = new ArrayList<>();
//		list.add(Arrays.asList("A","B","C"));
//		list.add(Arrays.asList("X","Y","Z"));
//		System.out.println(list);
//		System.out.println(list.contains(Arrays.asList("X","Y","Z")));
		
		List<User> list = new ArrayList<>();
		list.add(new User("Anna", 18));
		list.add(new User("Mike", 45));
		System.out.println(list);
		System.out.println(list.contains(new User("Anna", 18)));

		
//		List<String[]> list = new ArrayList<>();
//		list.add(new String[]{"AAA","BBB"});
//		list.add(new String[]{"EEE","qwe","SSSS"});
//		System.out.println(Arrays.deepToString(list.toArray()));
//		System.out.println(list.contains(new String[]{"AAA","BBB"}));

		
//		Set<String[]> set = new HashSet<>();
//		set.add(new String[]{"AAA","BBB"});
//		set.add(new String[]{"AAA","BBB"});
//		System.out.println(Arrays.deepToString(set.toArray()));
//		System.out.println(set.size());
//		System.out.println(set.contains(new String[]{"AAA","BBB"}));
		
//		Set<List<String>> set = new HashSet<>();
//		set.add(Arrays.asList("A","B"));
//		set.add(Arrays.asList("A","B"));
//		System.out.println(Arrays.deepToString(set.toArray()));
//		System.out.println(set.size());
//		System.out.println(set.contains(Arrays.asList("AAA","BBB")));
		
//		Set<List<String>> set = new HashSet<>();
//		System.out.println(set.add(Arrays.asList("A","B")));
//		System.out.println(set.add(Arrays.asList("A","B")));
//		System.out.println(set);
//		System.out.println(set.size());
	}

}
class User{
	String name;
	int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	//После реализации equals, коллекции будут правильно сравнивать User
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(this.getClass() != obj.getClass()){
			return false;
		}
		User that = (User)obj;
		
		if(that.age != this.age)
			return false;
		
		//return Objects.equals(this.name, that.name);
		//или
		if(this.name == null && that.name == null){
			return true;
		}
		if(this.name == null && that.name != null){
			return false;
		}
		if(this.name != null && that.name == null){
			return false;
		}
		if(this.name != null && that.name != null){
			return this.name.equals(that.name);
		}
		return true;
	}
}
