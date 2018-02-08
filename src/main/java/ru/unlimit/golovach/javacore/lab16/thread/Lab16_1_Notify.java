package ru.unlimit.golovach.javacore.lab16.thread;

public class Lab16_1_Notify {

	public static void main(String[] args) {
		Object ref0=new Object();
		Object ref1=new Object();
		synchronized(ref0){
			synchronized(ref1){
				ref0.notify();
				ref1.notify();
			}
		}

	}

}
