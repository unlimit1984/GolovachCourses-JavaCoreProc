package ru.unlimit.golovach.javacore.lab09.io;

import java.util.Arrays;

public class Lab9_2_Unicode {

	public static void main(String[] args) {
		for(int i=0; i<=65535; i++){
			System.out.format("%05d - %4s - '%s'\n",i,Integer.toString(i, 16),(char)i);
		}
		
//		for(int codePoint=65000; codePoint<=150000; codePoint++){
//			
//			char[] chars=Character.toChars(codePoint);
//			if(chars.length>1){
//				System.out.format("Decimal: %08d - HEX: %8s - chars[]: %s - length: %4s - Character.toChars: %15s ",codePoint, Integer.toString(codePoint, 16),Arrays.toString(chars),chars.length, chars  );
//				System.out.println();
//				System.out.println(chars);
//			}
//		}		
		
		//Cyrillic
//		for(char ch=0x0400;ch<=0x04FF;ch++)
//			System.out.println(ch);
		
		//Basic Latin
//		for(char ch=0x0000;ch<=0x00FF;ch++)
//			System.out.println(ch);		
		//System.out.println(Character.toChars(150000));
	}

}
