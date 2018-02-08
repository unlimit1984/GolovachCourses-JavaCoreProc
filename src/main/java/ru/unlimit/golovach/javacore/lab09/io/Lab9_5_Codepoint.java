package ru.unlimit.golovach.javacore.lab09.io;

public class Lab9_5_Codepoint {

	public static void main(String[] args) {
		String s=new String(new char[]{55378,56816} );
		System.out.println(s);

		System.out.println(s.codePointCount(0, 2));
		System.out.println(s.length());
		
		
		char[] chars=Character.toChars(150000);

		System.out.println(chars);
		System.out.println((int)chars[0]);
		System.out.println((int)chars[1]);
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		
		System.out.println((char)(55378));
	}

}
