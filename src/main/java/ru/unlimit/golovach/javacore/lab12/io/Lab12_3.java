package ru.unlimit.golovach.javacore.lab12.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

class PersonBad{
	String name;
	public PersonBad(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "PersonBad [name=" + name + "]";
	}
	
}
class PersonGood implements Serializable{
	String name;
	transient String tr_field="Trasient";
	transient int age=10;
	public PersonGood(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "PersonGood [name=" + name + ", tr_field=" + tr_field + ", age="
				+ age + "]";
	}
}
class Address{
//class Address implements Serializable{
	String street="Default";

	@Override
	public String toString() {
		return "Address [street=" + street + "]";
	}
	
}
class PersonWithAddress implements Serializable{
	String name;
	Address address=new Address();
	public PersonWithAddress(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "PersonWithAddress [name=" + name + ", address=" + address + "]";
	}

}
public class Lab12_3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		//oos.writeObject(new PersonBad("Bad"));
		//oos.writeObject(new PersonGood("Good"));
		oos.writeObject(new PersonWithAddress("with Address"));
		
		oos.flush();
		oos.close();
		
		byte[] bytes = baos.toByteArray();
		System.out.println(Arrays.toString(bytes));
		
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
		//PersonBad p = (PersonBad)ois.readObject();
		//PersonGood p = (PersonGood)ois.readObject();
		PersonWithAddress p = (PersonWithAddress)ois.readObject();
		System.out.println(p);
		
		
		
	}

}
