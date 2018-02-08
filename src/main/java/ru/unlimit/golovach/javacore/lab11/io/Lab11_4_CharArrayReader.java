package ru.unlimit.golovach.javacore.lab11.io;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

public class Lab11_4_CharArrayReader {

	public static void main(String[] args) throws IOException {
		char[] charBuff = new char[]{'H', 'e', 'l', 'l', 'o'};
		
		//Reader car=new CharArrayReader(charBuff);
		//или
		//CharArrayReader car=new CharArrayReader(charBuff);
		//f(car);
		
		//или совсем коротко
		f(new CharArrayReader(charBuff));
	}

	private static void f(Reader reader) throws IOException {
		int ch;
		while((ch=reader.read())!=-1){
			System.out.print((char)ch);
		}
	}

}
