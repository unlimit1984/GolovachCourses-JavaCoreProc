package ru.unlimit.golovach.javacore.lab20.collections;

import java.util.Objects;

public class PersonC {
	public final String name;
	public final int age;
	public PersonC(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null || this.getClass()!=obj.getClass()){
			return false;
		}
		PersonC that = (PersonC)obj;
		//age comparison
		if(age!=that.age)
			return false;
		//name comparison
		return Objects.equals(name, that.name);
	}
	@Override
	public int hashCode() {
		return 31*age + ((name==null) ? 0 : name.hashCode());
	}
	@Override
	public String toString() {
		return "PersonA [name=" + name + ", age=" + age + "]";
	}
}
