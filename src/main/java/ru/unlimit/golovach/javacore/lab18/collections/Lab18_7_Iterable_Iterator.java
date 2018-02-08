package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Arrays;

public class Lab18_7_Iterable_Iterator {

	public static void main(String[] args) {
		
		Company company=new Company("My", Arrays.asList(new Employee("Ivan", 18),new Employee("Jhon", 46)));
		
		for(Employee e: company){
			System.out.println(e);
		}

	}

}
