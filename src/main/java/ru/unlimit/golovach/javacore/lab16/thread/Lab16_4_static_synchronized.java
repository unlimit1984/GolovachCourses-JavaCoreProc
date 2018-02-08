package ru.unlimit.golovach.javacore.lab16.thread;
public class Lab16_4_static_synchronized {
	public static void main(String[] args) {
		f0();
	}
	//Аналогичные методы
	public static void f0(){
		Class clazz = Lab16_4_static_synchronized.class;
		synchronized (clazz) {
			clazz.notify();
		}
	}
	public synchronized static void f1(){
		Class clazz = Lab16_4_static_synchronized.class;
		clazz.notify();
	}
}
