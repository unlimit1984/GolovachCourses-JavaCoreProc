package ru.unlimit.golovach.javacore.lab06.exceptions;

public class Lab6_8_DZ1 {

	//На месте каждого комментария можно:
	//оставить все как есть
	//или вставить throw new NullPointerException();
	//рассмотреть все варианты (8 штук) и посчитать,
	//сколько разных трасс может вывести данная программа
	public static void main(String[] args) throws Throwable {
		System.err.print(0);
		try{
			System.err.print(1);
			//if(true)throw new NullPointerException();
			System.err.print(2);
		}
		catch(RuntimeException e){
			System.err.print(3);
			//if(true)throw new NullPointerException();
			System.err.print(4);
	
		}

		finally{
			System.err.print(5);
			//if(true)throw new NullPointerException();
			System.err.print(6);

		}
		System.err.println(7);
	}
}
