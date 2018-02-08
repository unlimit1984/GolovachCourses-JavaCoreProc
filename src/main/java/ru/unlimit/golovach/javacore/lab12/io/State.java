package ru.unlimit.golovach.javacore.lab12.io;

import java.io.IOException;
import java.io.OutputStream;

public abstract class State {
	protected final OutputStream out;
	
	public State(OutputStream out) {
		this.out = out;
	}
	
	public abstract State next(byte b) throws IOException;
	public void finish() throws IOException {}

}
