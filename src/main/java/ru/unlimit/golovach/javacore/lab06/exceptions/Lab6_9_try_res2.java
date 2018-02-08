package ru.unlimit.golovach.javacore.lab06.exceptions;

class Resource implements AutoCloseable{
	private final String resourceName;
	public Resource(String s){
		resourceName=s;
		System.err.println("new:"+resourceName);
	}
	public void use(){
		System.err.println("use");
	}
	@Override
	public void close() throws Exception {
		System.err.println("auto-close:"+resourceName);
		throw new Exception("close exception "+resourceName);
	}
}
class BadResource implements AutoCloseable{
	private final String resourceName;
	public BadResource(String s){
		resourceName=s;
		
		throw new RuntimeException("bad resource constructor "+resourceName);
	}
	public void use(){
		System.err.println("use");
	}
	@Override
	public void close() throws Exception {
		//System.err.println("auto-close:"+resourceName);
		throw new RuntimeException("bad resource closing"+resourceName);
	}
}

public class Lab6_9_try_res2 {


	public static void main(String[] args) throws Exception{
		try(Resource res=new Resource("A");Resource res2=new Resource("A1");BadResource res0=new BadResource("B");/* BadResource res3=new BadResource("C")*/){
			System.err.println("try");
			throw new Exception("error from try");
		}
		catch(Throwable t){
			System.err.println("catch");
			throw t;
			//t.printStackTrace();
			//int i=3;
			//int j=i/0;
		}
	}
}
