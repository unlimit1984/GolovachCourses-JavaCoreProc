package ru.unlimit.golovach.javacore.lab06.exceptions;

public class Lab6_5_RuntimeException {

	public static void main(String[] args) throws Throwable {
		
		try{
			System.out.println(1);
			throw new Throwable();
		}
		catch(RuntimeException e){
			System.out.println(2);
		}
		catch(Error e){
			System.out.println(3);
		}
		System.out.println(4);
	}
}
