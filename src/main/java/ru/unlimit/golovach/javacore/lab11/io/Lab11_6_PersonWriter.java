package ru.unlimit.golovach.javacore.lab11.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ru.unlimit.golovach.javacore.lab11.io.Person.Sex;


public class Lab11_6_PersonWriter {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream buff=new ByteArrayOutputStream();
		PersonOutputStream out = new PersonOutputStream(
				new DataOutputStream(buff)); 
	
		Person p1=new Person("Mike", 45, /*new Sex[]{null, Sex.M}*/null);
		Person p2=new Person(null, 27, new Sex[]{Sex.F});
		
		out.write(p1);
		out.write(p2);
		
		out.flush();
		out.close();
		
		PersonInputStream in=new PersonInputStream(
				new DataInputStream(
						new ByteArrayInputStream(buff.toByteArray())));
		
		for(int i=0;i<2;i++){
			System.out.println(in.readPerson());
		}
	}
}
