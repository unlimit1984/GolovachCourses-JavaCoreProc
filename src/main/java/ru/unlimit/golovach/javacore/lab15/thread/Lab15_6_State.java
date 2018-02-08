package ru.unlimit.golovach.javacore.lab15.thread;

public class Lab15_6_State {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread();
		thread.start();
		thread.join();
		System.out.println(thread.getState());

	}

}
