package ru.unlimit.golovach.javacore.lab08.exceptions;

import java.io.IOException;

public class Lab8_1_MultiExceptions {

	public static void main(String[] args) throws Exception//throws IOException, InterruptedException{
	{
		//1-й вариант multi-catch
//		try {
//			f();
//		} catch (IOException | InterruptedException e) {
//			e.printStackTrace();
//		}
		//2-й вариант try-catch
//		try {
//			f();
//		} catch (IOException e) {
//		} catch (InterruptedException e) {
//		}
		
		f();
	}

	private static void f() throws IOException, InterruptedException {
		if(System.nanoTime()%2==0)
			throw new IOException();
		else
			throw new InterruptedException();
		
	}

}
