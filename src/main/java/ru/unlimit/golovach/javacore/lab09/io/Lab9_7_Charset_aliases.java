package ru.unlimit.golovach.javacore.lab09.io;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Lab9_7_Charset_aliases {

	public static void main(String[] args) {
		Charset charset=StandardCharsets.US_ASCII;
		
		System.out.println(charset.name());
		System.out.println(charset.displayName());
		System.out.println(charset.aliases());

	}

}
