package ru.unlimit.golovach.javacore.lab08.exceptions;

public class Lab8_2_ExceptionsInThreads {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		//t.setUncaughtExceptionHandler(new MyHandlerException());

		throw new Error("error");
	}

}
