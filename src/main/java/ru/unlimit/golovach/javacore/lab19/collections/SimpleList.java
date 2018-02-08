package ru.unlimit.golovach.javacore.lab19.collections;

import java.util.Iterator;

public interface SimpleList<E> extends Iterable<E> {

	//ADD
	boolean add(E newElement);
	void add(int index, E element);
	//READ
	Iterator<E> iterator();
	E get(int index);
	//CHECK
	boolean contains(Object value);
    int size();
    boolean isEmpty();
	//MUTATE
    E set(int index, E element);
    //REMOVE
    E remove(int index);
    boolean remove(Object o);
}
