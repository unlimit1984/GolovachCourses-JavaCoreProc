package ru.unlimit.golovach.javacore.lab16.thread;

public class Lab16_2_Notify {

	public static void main(String[] args) {
		synchronized(new Object()){
			new Object().notify();
		}

	}

}
