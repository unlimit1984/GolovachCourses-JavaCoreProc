package ru.unlimit.golovach.javacore.lab05.exceptions;

import java.io.IOException;

class Printer{
	public void print(String s) throws PrinterException{
		//System.out.println(s);
		if(System.nanoTime()%2==0)
			throw new PrinterException(new Throwable("ups"),"четное, а должно быть нечетным", 1, 45);
		System.out.println(s);
	}
	
	public int getVal() throws Exception{
		int result=0;
		try{
			System.err.println("try block");
			result=5/0;
		}
		catch(NullPointerException e){
			System.err.println("catch block: NullPointerException");
		}
		catch(ArithmeticException e){
			System.err.println("catch block: ArithmeticException");
			System.err.println(e.getMessage());
			throw new Exception("test Exception");
		}
		finally{
			System.err.println("finally block");
			if(true)throw new Exception("exception from finally");
			//return result;
		}
		return result;
	}
}

class PrinterException extends Exception{
	String document;
	int errorCodeA;
	int errorCodeB;
	
	
	
	public PrinterException(String document, int errorCodeA, int errorCodeB) {
		this.document = document;
		this.errorCodeA = errorCodeA;
		this.errorCodeB = errorCodeB;
	}
	public PrinterException(Throwable t,String document, int errorCodeA, int errorCodeB) {
		super(t);
		this.document = document;
		this.errorCodeA = errorCodeA;
		this.errorCodeB = errorCodeB;
		
	}	
	public String getDocument() {
		return document;
	}
	public int getErrorCodeA() {
		return errorCodeA;
	}
	public int getErrorCodeB() {
		return errorCodeB;
	}
	
}
public class Lab5_2_PrinterException {


	

	
	public static void main(String[] args) throws Exception {
/*
		try {
			//new Printer().print("Hello World");
			throw new NullPointerException();
		} catch(Error e){
			System.out.println("RuntimeException");
		} catch (Throwable e) {
		//} catch (PrinterException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//Throwable t=e.getCause();
			//System.out.println(t.getCause().getMessage());
			System.out.println("Throwable");
		}
*/
		Printer p=new Printer();
		int k=p.getVal();
		System.out.println(k);

	}

}
