package ru.unlimit.golovach.javacore.lab12.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Zero extends State {

	public Zero(OutputStream out) {
		super(out);
	}

	@Override
	public State next(byte value) throws IOException {
		if(value==0){
			return this;
		}else{
			return new Numbers(out).next(value);
		}
	}

	@Override
	public void finish() {
	}

}
