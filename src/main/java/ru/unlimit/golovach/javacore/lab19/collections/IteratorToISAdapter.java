package ru.unlimit.golovach.javacore.lab19.collections;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

//Ниже адаптер в одну сторону
//а надо написать адаптер в обратную сторону, по InputStream слепить итератор
public class IteratorToISAdapter extends InputStream {

	public IteratorToISAdapter(Iterator<Byte> iterator) {
		this.iterator = iterator;
	}

	private final Iterator<Byte> iterator;
	
	@Override
	public int read() throws IOException {
		return iterator.hasNext() ? iterator.next() & 0xFF : -1;
	}

}
