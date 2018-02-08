package ru.unlimit.golovach.javacore.lab08.exceptions;

import java.io.IOException;

public class Lab8_3_stupidException {

	public static void main(String[] args) throws IOException{
		try {
			throw new IOException();
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main2(String[] args) throws Exception{//throws IOException{
		try {
			Exception e=new IOException();
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main3(String[] args) throws Exception{//throws IOException{
		try {
			throw new IOException();
		} catch (Exception e) {
			Exception e2=e;
			throw e2;
		}
	}	
	public static void main4(String[] args) throws IOException, InterruptedException{
		try{
			if(true)
				throw new IOException();
			else
				throw new InterruptedException();
		}
		catch(IOException | InterruptedException e){
			throw e;
		}
	}	
	public static void main5(String[] args) throws IOException, InterruptedException{
		try{
			if(true)
				throw new IOException();
			else
				throw new InterruptedException();
		}
		catch(Exception e){//или Throwable 
			throw e;
		}
	}	
	public static void main6(String[] args) throws IOException, InterruptedException{
		try{
			if(true)
				throw new IOException();
			else
				throw new InterruptedException();
		}
		catch(Exception e){//или Throwable
			Exception e2=e;
			//throw e2;//ломается
		}
	}	
}
