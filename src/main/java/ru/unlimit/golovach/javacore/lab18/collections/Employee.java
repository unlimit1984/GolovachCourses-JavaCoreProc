package ru.unlimit.golovach.javacore.lab18.collections;

public class Employee {

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
