package ru.unlimit.golovach.javacore.lab17.thread;

import java.util.concurrent.TimeoutException;

public class SingleElementBuffer_TimeOut{

	protected Integer elem = null;
	
	public synchronized void put(int newElement, long timeout) throws InterruptedException, TimeoutException{
		long waitTime = timeout;
		while(elem!=null && waitTime>0){
			long t0 = System.currentTimeMillis();
			this.wait(waitTime);
			long t1 = System.currentTimeMillis();
			long elapsedTime = t1-t0;
			waitTime -= elapsedTime; 
		}
		
		//todo: throw new TimeoutException
		if(elem!=null && waitTime<=0){
			throw new TimeoutException();
		}
		
		this.elem=newElement;
		this.notifyAll();
	}
	public synchronized int get(long timeout) throws InterruptedException, TimeoutException {
		long waitTime = timeout;
		
		while(elem==null && waitTime>0){
			long t0 = System.currentTimeMillis();
			this.wait(waitTime);
			long t1 = System.currentTimeMillis();
			long elapsedTime = t1-t0;
			waitTime -= elapsedTime; 
		}

		//todo: throw new TimeoutException
		//todo: throw new TimeoutException
		if(elem ==null && waitTime<=0){
			throw new TimeoutException();
		}
		
		Integer result=this.elem;
		this.elem=null;
		this.notifyAll();
		return result;
	}
}
