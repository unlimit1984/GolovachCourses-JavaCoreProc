package ru.unlimit.golovach.javacore.lab17.thread;

//Оптимизировали буффер, разобраться, корректно или нет?
public class SingleElementBufferOptimized_B extends SingleElementBuffer{
	
	public synchronized void put(int newElement) throws InterruptedException{
		while(elem!=null){
			this.wait();
			if(elem!=null){
				this.notify();
			}
		}
		elem=newElement;
		this.notify();
	}
	public synchronized int get() throws InterruptedException {
		while(elem==null){
			this.wait();
			if(elem == null){
				this.notify();
			}
		}
		Integer result=this.elem;
		elem=null;
		this.notify();
		return result;
	}
}
