package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Iterator;

public class SquareIterator implements Iterator<Integer> {

	private int counter=1;
	
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		return counter*(counter++);
	}

	//требуется только в JDK7 и меньше, в JDK8 не требуется
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}




}
