package ru.unlimit.golovach.javacore.lab17.thread;

public class SingleElementBuffer {

	protected Integer elem = null;
	public synchronized void put(int newElement) throws InterruptedException{
		while(this.elem!=null){
			this.wait();
		}
		this.elem=newElement;
		this.notifyAll();
	}
	public synchronized int get() throws InterruptedException {
		while(this.elem==null){
			this.wait();
		}
		Integer result=this.elem;
		this.elem=null;
		this.notifyAll();
		return result;
	}
}
