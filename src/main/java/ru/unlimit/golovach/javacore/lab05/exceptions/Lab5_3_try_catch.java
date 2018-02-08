package ru.unlimit.golovach.javacore.lab05.exceptions;

public class Lab5_3_try_catch {

	public static void main(String[] args) {
		
//		try{
//			System.out.println(0);
//			int x=1/1;
//			System.out.println(1);
//		}catch(RuntimeException e){
//			System.out.println(2);
//		}catch(Throwable e){
//			System.out.println(3);
//		}
//		System.out.println(4);

//		try{
//			System.out.println(0);
//			int x=1/0;
//			System.out.println(1);
//		}catch(RuntimeException e){
//			System.out.println(2);
//			throw new Error();
//		}catch(Throwable e){
//			System.out.println(3);
//		}
//		System.out.println(4);
		
		//надо рисовать, пройдет по дереву и вылетет с exception, но неизвестно, сколько ждать))
		try{
			main(args);
		}
		catch(StackOverflowError e){
			main(args);
		}
	}

}
