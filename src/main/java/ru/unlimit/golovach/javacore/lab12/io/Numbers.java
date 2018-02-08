package ru.unlimit.golovach.javacore.lab12.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Numbers extends State {
	private ByteArrayOutputStream buff = new ByteArrayOutputStream();
	protected Numbers(OutputStream out) {
		super(out);
	}

	@Override
	public State next(byte value) throws IOException {
		if(value==0){
			out.write(buff.toByteArray());
			out.flush();
			return new Zero(out);
		}else{
			buff.write(value);
			return this;
		}
	}

	@Override
	public void finish() throws IOException {
		out.write(buff.toByteArray());
		out.flush();
	}

}
