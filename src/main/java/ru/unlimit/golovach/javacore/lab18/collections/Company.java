package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<Employee>{

	private String name;
	public Company(String name, List<Employee> list) {
		this.name = name;
		this.list = list;
	}

	private List<Employee> list;

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	@Override
	public Iterator<Employee> iterator() {
		
		return list.iterator();
	}
	
}
