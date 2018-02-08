package ru.unlimit.golovach.javacore.lab11.io;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

import ru.unlimit.golovach.javacore.lab11.io.Person.Sex;

class PersonInputStream implements PersonInput{

	private final DataInputStream in;
	
	
	public PersonInputStream(DataInputStream in) throws IOException {
		this.in=in;
	}

	@Override
	public Person readPerson() throws IOException {
		String name=in.readBoolean() ? in.readUTF() : null;
		int age=in.readInt();
		Sex[] sex=null;
		if(in.readBoolean()){//sex!=null
			int length=in.readInt();//sex.length)
			sex=new Sex[length];
			for(int i=0;i<length;i++){
				byte sexByte=in.readByte();
				switch(sexByte){
					case 0:
						sex[i]=null;
						break;
					case 1:
						sex[i]=Sex.F;
						break;
					case 2:
						sex[i]=Sex.M;
						break;
				}
			}
		}
		return new Person(name, age, sex);
	}
}