package ru.unlimit.golovach.javacore.lab11.io;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Arrays;

public class Lab11_3_CharArrayWriter {

	public static void main(String[] args) throws IOException {
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("Привет, ");
		caw.write(new char[]{'J', 'a', 'v', 'a', '!'});

		char[] chars=caw.toCharArray();
		System.out.println(chars);
	}

}
