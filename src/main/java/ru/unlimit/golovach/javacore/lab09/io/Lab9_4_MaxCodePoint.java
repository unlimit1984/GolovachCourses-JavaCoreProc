package ru.unlimit.golovach.javacore.lab09.io;

public class Lab9_4_MaxCodePoint {

	public static void main(String[] args) {
		int i=0;
		try{
			while(true){
				Character.toChars(i++);
			}
		}
		catch(IllegalArgumentException e){
			System.out.format("Max codepoint: %d", i);
		}
	}

}
