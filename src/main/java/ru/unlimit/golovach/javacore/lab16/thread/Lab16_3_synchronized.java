package ru.unlimit.golovach.javacore.lab16.thread;

public class Lab16_3_synchronized {

	public static void main(String[] args) {
		
	}
	//Аналогичные методы
	public void f0(){
		synchronized (this) {
			this.notify();
		}
	}
	public synchronized void f1(){
			this.notify();
	}
}
