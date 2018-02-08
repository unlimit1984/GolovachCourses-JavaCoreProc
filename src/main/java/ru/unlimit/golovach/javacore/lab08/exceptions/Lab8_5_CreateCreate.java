package ru.unlimit.golovach.javacore.lab08.exceptions;

class FailCreate implements AutoCloseable{

	private String msg;
	public FailCreate(String s) {
		msg=s;
		System.err.println("new:"+msg);
		throw new Error(msg);
	}
	
	@Override
	public void close(){
		System.err.println("close:"+msg);
	}
}

public class Lab8_5_CreateCreate {

	public static void main(String[] args) {
		
		try(FailCreate x=new FailCreate("X"); FailCreate y=new FailCreate("Y")){
			throw new Error("E");
		}

	}

}
