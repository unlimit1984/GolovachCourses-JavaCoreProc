package ru.unlimit.golovach.javacore.lab06.exceptions;

import javax.management.RuntimeErrorException;



public class Lab6_8_try_finally {
	
	public static int getInt(){
		return 0;
	}
	public static int getInt2(){
		try{
			return 0;
		}
		finally{
			return 1;
		}
	}
	public static void main(String[] args) throws Exception{

//		try{
//			System.err.println(0);
//			if(true) throw new RuntimeException("try");
//
//		}finally{
//			System.err.println(1);
//			if (true)throw new RuntimeException("finally");
//		}
//		System.err.println(2);
		
//		try{
//			System.err.println("try");
//			if(true)
//				return;
//		}
//		finally{
//			System.err.println("finally");
//		}
//		System.out.println("after finally");
		
//		try{
//			System.err.println("try");
//			return;
//		}
//		finally{
//			System.err.println("finally");
//			throw new Exception("fin");
//			
//		}
		
		System.out.println(getInt2());

	}

}
