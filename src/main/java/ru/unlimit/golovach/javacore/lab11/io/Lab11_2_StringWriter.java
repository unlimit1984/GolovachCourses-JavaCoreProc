package ru.unlimit.golovach.javacore.lab11.io;

import java.io.IOException;
import java.io.StringWriter;

public class Lab11_2_StringWriter {

	public static void main(String[] args) throws IOException {
		
		StringWriter sw=new StringWriter();
		sw.write(new char[]{'п','р','и','в','е','т'});
		
		String s = sw.toString();
		System.out.println(s);		

	}

}
