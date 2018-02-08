package ru.unlimit.golovach.javacore.lab06.exceptions;

public class Lab6_6_ExceptionAsClass {

	public static void main(String[] args) throws Throwable {
		
		try{
			System.err.println(1);
			if(true)
				throw new Exception("try");
		}
		finally{
			System.err.println(2);
			if(true) throw new Exception("finally"); //закомментируй и увидь разницу в теле исключения
		}
		System.err.println(4);
	}
}
