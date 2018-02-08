package ru.unlimit.golovach.javacore.lab05.exceptions;
public class Lab5_4_return_catch {
	public static int getVal() throws Exception{
		int result=0;
		
		try{
			System.err.println("try");
			result=5/0;
		}catch(ArithmeticException e){
			System.err.println("catch");
			//if(true)return result;
			if(true)throw new Exception("From catch new Exception");
		}
		finally{
			System.err.println("finally");
			//if(true)return result;//заккоментируй и раскомментируй и увидишь разницу
		}
		System.err.println("after finally");
		return result;
	}
	public static void main(String[] args) throws Exception {

		int k=getVal();
		System.err.println(k);
	}
}
