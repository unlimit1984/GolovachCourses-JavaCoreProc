package ru.unlimit.golovach.javacore.lab06.exceptions;

public class Lab6_8_DZ2 {

	//На месте каждого комментария можно:
	//оставить все как есть
	//или вставить throw new NullPointerException()
	//или вставить throw new RuntimeException()
	//или вставить throw new IOException()
	//или вставить throw new Error()
	//рассмотреть все варианты (8 штук) и посчитать,
	//сколько разных трасс может вывести данная программа
	public static void main(String[] args) throws Throwable {
		System.err.print("0 ");
		try{
			System.err.print("1 ");
			//if(true)throw new NullPointerException();
			//if(true)throw new RuntimeException();
			//if(true)throw new IOException();
			//if(true)throw new Error();
			System.err.print("2 ");
		}
		catch(NullPointerException e){
			System.err.print("3 ");
			//if(true)throw new NullPointerException();
			//if(true)throw new RuntimeException();
			//if(true)throw new IOException();
			//if(true)throw new Error();
			System.err.print("4 ");	
		}
		catch(RuntimeException e){
			System.err.print("5 ");
			//if(true)throw new NullPointerException();
			//if(true)throw new RuntimeException();
			//if(true)throw new IOException();
			//if(true)throw new Error();
			System.err.print("6 ");	
		}
		catch(Exception e){
			System.err.print("7 ");
			//if(true)throw new NullPointerException();
			//if(true)throw new RuntimeException();
			//if(true)throw new IOException();
			//if(true)throw new Error();
			System.err.print("8 ");	
		}
		finally{
			System.err.print("9 ");
			//if(true)throw new NullPointerException();
			//if(true)throw new RuntimeException();
			//if(true)throw new IOException();
			//if(true)throw new Error();
			System.err.print("10 ");
		}
		System.err.println("11 ");
	}
}
