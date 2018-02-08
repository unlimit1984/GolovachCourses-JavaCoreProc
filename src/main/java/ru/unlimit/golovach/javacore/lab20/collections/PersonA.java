package ru.unlimit.golovach.javacore.lab20.collections;

import java.util.Objects;

public class PersonA {
	public final String name;
	public final int age;
	public PersonA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null || this.getClass()!=obj.getClass()){
			return false;
		}
		PersonA that = (PersonA)obj;
		//age comparison
		if(age!=that.age)
			return false;
		//name comparison
		return Objects.equals(name, that.name);
	}
	@Override
	public String toString() {
		return "PersonA [name=" + name + ", age=" + age + "]";
	}
}
