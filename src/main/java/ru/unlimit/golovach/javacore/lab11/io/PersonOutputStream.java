package ru.unlimit.golovach.javacore.lab11.io;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

import ru.unlimit.golovach.javacore.lab11.io.Person.Sex;

class PersonOutputStream implements PersonOutput{
	private final DataOutputStream out;
	
	public void flush() throws IOException {
		out.flush();
	}

	public void close() throws IOException {
		out.close();
	}

	public PersonOutputStream(DataOutputStream out) {
		this.out = out;
	}

	@Override
	public void write(Person person) throws IOException {
		out.writeBoolean(person.getName()!=null);
		if(person.getName()!=null){
			out.writeUTF(person.getName());	
		}
		out.writeInt(person.getAge());
		out.writeBoolean(person.getSex()!=null);
		if(person.getSex()!=null){
			out.writeInt(person.getSex().length);//записываем размер массива гендерности
			for(Sex sex: person.getSex()){
				byte sexByte;
				if(sex==null){
					sexByte=0;
				}else{
					sexByte=(sex== Sex.F) ? (byte)1 : (byte)2;
				}
				out.writeByte(sexByte);
			}
		}
	}
	
}