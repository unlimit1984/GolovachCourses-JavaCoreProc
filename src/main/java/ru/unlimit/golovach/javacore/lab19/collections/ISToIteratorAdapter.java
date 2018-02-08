package ru.unlimit.golovach.javacore.lab19.collections;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ISToIteratorAdapter implements Iterator<Byte>{
	private final InputStream is;
	private int last = -1;
	private boolean wasHasNext=false;
	
	public ISToIteratorAdapter(InputStream is) {
		this.is = is;
		try{
			this.last = is.read();
		}
		catch(IOException e){
			throw new RuntimeException(e);
		}
	}

	
	@Override
	public boolean hasNext() {
		
		return last==-1 ? false : true;
	}

	@Override
	public Byte next() {
		if(last == -1){
			throw new NoSuchElementException();
		}
		try {
			int result = last;
			last = is.read();
			return (byte)result;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
