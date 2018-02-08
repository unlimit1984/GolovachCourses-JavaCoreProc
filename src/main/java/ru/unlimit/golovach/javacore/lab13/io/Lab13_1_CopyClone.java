package ru.unlimit.golovach.javacore.lab13.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Street implements Serializable, Cloneable{
	String value;
	public Street(String value) {this.value = value;}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Street street= (Street) super.clone();
		//street.value=new String(this.value);//если закомментировать, будет  клон, а так как будто сериализация
		return street;
	}

	@Override
	public String toString() {return "Street [value=" + value + "]";}
}
class Address implements Serializable, Cloneable{
	String s;
	int age;
	Street street;
	
	public Address(String s, int age, Street build) {
		this.s = s;this.age = age;this.street = build;}
	@Override
	public String toString() {
		return "Address [s=" + s + ", age=" + age + ", street="
				+ street + "]";
	}
	@Override
	public/*protected*/ Object clone() throws CloneNotSupportedException {
		Address addr = (Address) super.clone();
		//addr.street = (Street) addr.street.clone(); //если закомментировать, будет  клон, а так как будто сериализация
		return addr;
	}
}

public class Lab13_1_CopyClone {
	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		Address address = new Address("Green", 25, new Street("25"));
		//Address copy = (Address)copySer(address);
		Address copy = (Address)copyClone(address);
		
		System.out.println("Original:");
		System.out.println(address);
		
		System.out.println("Copy:");
		System.out.println(copy);

		System.out.println("Address: " + (address==copy));
		System.out.println("s: " + (address.s==copy.s));
		System.out.println("age: " + (address.age==copy.age));
		System.out.println("street: " + (address.street==copy.street));
		System.out.println("street.value: " + (address.street.value==copy.street.value));
	}
	
	//При сериализации создается глубокая копия объекта
	private static Object copySer(Object ref) throws IOException, ClassNotFoundException{
		ByteArrayOutputStream buff = new ByteArrayOutputStream();
		ObjectOutput oo = new ObjectOutputStream(buff);
		oo.writeObject(ref);
		oo.flush();
		oo.close();
		byte[] bytes = buff.toByteArray();
		
		return new ObjectInputStream(new ByteArrayInputStream(bytes)).readObject();
	}
	//При клонировании создается поверхностная копия, ссылочные поля ссылаются на оригинал
	private static Object copyClone(Address ref) throws CloneNotSupportedException{
		return ref.clone();
	}
}
