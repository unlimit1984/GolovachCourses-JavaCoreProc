package ru.unlimit.golovach.javacore.lab09.io;

import java.util.Arrays;

public class Lab9_3 {

	public static void main(String[] args) {
		char ch1=0;
		char ch2=65535;
		
		char ch3=0x0000;
		char ch4=0xFFFF;
		
		char ch5=0b11101;
		
		char ch6='Ы';// char получает номер символа в Unicode
		
		char ch7='\uFFFF';
		
		
//		System.out.println((int)ch6);
//
//		System.out.println('\u0416');
//		String s="\u0416\u0416\u0416\u0416\u0416";
//		System.out.println(s);
		
//		for(char c='а'; c<='я';c++)
//			System.out.println(c);
		
		
		Character ch8=new Character('Ж');
		Character ch9='Ж';
		
		
		char[] chars = Character.toChars(1016);
		System.out.println(Arrays.toString(chars)+" "+chars.length);
		System.out.println(chars);
	}

}
