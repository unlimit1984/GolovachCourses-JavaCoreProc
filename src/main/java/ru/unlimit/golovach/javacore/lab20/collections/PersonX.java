package ru.unlimit.golovach.javacore.lab20.collections;

import java.util.Objects;

public class PersonX {
	public final String name;
	public final int age;
	public PersonX(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null || this.getClass()!=obj.getClass()){
			return false;
		}
		PersonX that = (PersonX)obj;
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
