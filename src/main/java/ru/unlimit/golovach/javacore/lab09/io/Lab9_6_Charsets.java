package ru.unlimit.golovach.javacore.lab09.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Lab9_6_Charsets {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		Charset iso88591	= StandardCharsets.ISO_8859_1;
		Charset ascii 		= StandardCharsets.US_ASCII;
		Charset utf16		= StandardCharsets.UTF_16;
		Charset utf16be		= StandardCharsets.UTF_16BE;
		Charset utf16le		= StandardCharsets.UTF_16LE;
		Charset utf8		= StandardCharsets.UTF_8;
		

		Charset utf=Charset.forName("UTF-8");
		//...
		
		System.out.println(Arrays.toString("\uFFFF".getBytes("latin1")));
		System.out.println(Arrays.toString("\u003F".getBytes("latin1")));
		
		
	}

}
