package ru.unlimit.golovach.javacore.lab09.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Lab9_1 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		char ch="abc".charAt(1);
		"asdff".toUpperCase();
		new String(new char[]{'a','b','c'});
		
		byte[] b="A".getBytes();				//берется кодировка JVM по умолчанию, так плохо
		byte[] b2="A".getBytes("UTF-16");		//так хорошо, в начале указывается 2 доп. байта, BE или LE
		
		byte[] b3="A".getBytes("UTF-16BE");		//char разваливается на 2 байта
		byte[] b4="A".getBytes("UTF-16LE");

		
		
//		System.out.println("A".getBytes("UTF-16").length);
//		System.out.println("AA".getBytes().length);
		
		System.out.println(Arrays.toString("Ж".getBytes()));
		System.out.println(Arrays.toString("Ж".getBytes("UTF-8")));
		System.out.println(Arrays.toString("Ж".getBytes("UTF-16")));
		System.out.println(Arrays.toString("Ж".getBytes("UTF-16BE")));
		System.out.println(Arrays.toString("Ж".getBytes(StandardCharsets.UTF_16BE)));
		System.out.println(Arrays.toString("Ж".getBytes("UTF-16LE")));
		System.out.println(Arrays.toString("Ж".getBytes("UTF-32")));
		System.out.println(Arrays.toString("Ж".getBytes("UTF-32BE")));
		System.out.println(Arrays.toString("Ж".getBytes("UTF-32LE")));

		System.out.println("Default Charset="+Charset.defaultCharset().displayName());
		
//		System.out.println("ЭЮЯ".getBytes("UTF-8").length);
//		System.out.println("ЭЮЯ".getBytes("latin1").length);
		
		
		byte[] bytes = "ЖЖ".getBytes("UTF-16");
		String s=new String(bytes,StandardCharsets.UTF_16);
		String s2=new String(bytes,StandardCharsets.UTF_8);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(Arrays.toString(bytes));

	}

}
