package ru.unlimit.golovach.javacore.lab19.collections;

import java.util.Iterator;


//не сделан iterator и два remove-метода 
public class SimpleArrayList<E> implements SimpleList<E> {
	private Object[] elementData;
	private int size=0;

	public SimpleArrayList() {
		this(10);
	}
	public SimpleArrayList(int initialCapacity) {
		this.elementData = new Object[initialCapacity];
	}

	
	@Override
	public boolean add(E newElement) {
        ensureCapacity(size + 1);  // Increments modCount!!
        elementData[size++] = newElement;
        return true;

	}

	private void ensureCapacity(int minCapacity) {
		if(elementData == new Object[]{}){
			minCapacity = Math.max(10, minCapacity);
		}
	}
	@Override
	public void add(int index, E element) {
        rangeCheck(index);
        ensureCapacity(size + 1);  // Increments modCount!!
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
		
	}

	private void rangeCheck(int index) {
		
	}
	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public boolean contains(Object value) {
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

}
