package ru.unlimit.golovach.javacore.lab16.thread;

public class Lab16_5_PermGen {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class clazz=Lab16_5_PermGen.class;
		Lab16_5_PermGen o=(Lab16_5_PermGen)clazz.newInstance();
		o.f();
		
		Class c1=Object.class;
		Class c2=new Object().getClass();
		
		//Из забавного
		Class classObj = Object.class;
		Object ref = classObj;
		//или
		new Object().getClass().getClass().getClass().getClass().getClass().getClass();
		
	}
	public static void f(){
		System.out.println("test");
	}
}
