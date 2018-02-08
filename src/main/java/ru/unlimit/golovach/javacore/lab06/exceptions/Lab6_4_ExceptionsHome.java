package ru.unlimit.golovach.javacore.lab06.exceptions;

public class Lab6_4_ExceptionsHome {

	public static void main(String[] args) throws Exception {
		
		
		try{
			System.err.println(1);
			throw new Exception("First");
		}
		catch(Exception e){
			System.err.println(2);
			System.err.println(e.getMessage());
			throw e;//new Exception("Second");
		}
		finally{
			System.err.println(3);
		}
	}

}
