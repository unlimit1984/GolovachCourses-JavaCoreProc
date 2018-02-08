package ru.unlimit.golovach.javacore.lab06.exceptions;

import java.util.Arrays;

class X implements AutoCloseable{
	public X(String s){
		name=s;
		System.err.println("new X with name="+name);
	}
	String name="";
	@Override
	public void close() throws Exception {
		System.err.println("AutoCloseable "+name+" closing.");
		throw  new RuntimeException(name);
	}
}
public class Lab6_9_try_res {


	public static void main(String[] args) throws Throwable {
		try(X x1=new X("x1");X x2=new X("x2");X x3=new X("x3");){
			System.err.println("try");
			//throw new Exception("try", new Error("inner error"));//можно комментить
		}
		catch(Exception e){
			System.err.println("catch");
			
			Exception bigEx=new Exception("big");
			bigEx.addSuppressed(e);
			throw bigEx;
			//throw e;
//			throw new Exception("catch");//комментить
		}
		finally{
			System.err.println("finally");
		}

//		try(X x1=new X("x1");X x2=new X("x2");X x3=new X("x3");){
//			System.err.println("try");
//			throw new Exception();
//		}
//		finally{
//			System.err.println("finally");
//		}
		
//		try(X x1=new X("x1");X x2=new X("x2");X x3=new X("x3");){
//			System.err.println("try");
//			Exception ex=new Exception(new Error(new NullPointerException()));
//			ex.addSuppressed(new RuntimeException("1"));
//			ex.addSuppressed(new RuntimeException("2"));
//			ex.addSuppressed(new RuntimeException("3"));
//			throw ex;
//		}
//		finally{
//			System.err.println("finally");
//		}	
		
//		try(X x1=new X("x1");X x2=new X("x2");X x3=new X("x3")){
//			System.err.println("try");
//			throw new Exception("First",new Error("cause"));
//		}
//		catch(Throwable t){
//			System.err.println("msg="+t.getMessage());
//			System.err.println("cause="+t.getCause());
//			System.err.println("supressed="+Arrays.toString(t.getSuppressed()));
//			t.printStackTrace();
//			
//		}
//		finally{
//			System.err.println("finally");
//		}		
	}
}
