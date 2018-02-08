package ru.unlimit.golovach.javacore.lab08.exceptions;

import java.lang.Thread.UncaughtExceptionHandler;

public class MyHandlerException implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Thread "+t.getName()+" throws "+e.getClass());

	}

}
