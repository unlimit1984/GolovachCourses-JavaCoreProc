package ru.unlimit.golovach.javacore.lab06.exceptions;

public class Lab6_7_try_finally {

	public static void main(String[] args) throws Throwable {
		
		try{
			System.err.println(1);
			RuntimeException t=new RuntimeException();
			if(true)throw t;
		}
		catch(RuntimeException e){
			System.err.println(2);
			throw e;
		}
		catch(Throwable e){
			System.err.println(3);
			throw e;
		}
		finally{
			System.err.println(3.5);
		}
		System.err.println(4);
	}
}
