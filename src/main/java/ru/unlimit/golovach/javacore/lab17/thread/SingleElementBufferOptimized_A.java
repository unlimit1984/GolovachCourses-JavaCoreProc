package ru.unlimit.golovach.javacore.lab17.thread;

//Оптимизировали буффер, разобраться, корректно или нет?
public class SingleElementBufferOptimized_A extends SingleElementBuffer{
	
	//private Integer elem = null;
	private int waitedProducers=0;//количество спящих производителей
	private int waitedConsumers=0;//количество спящих потребителей
	
	public synchronized void put(int newElement) throws InterruptedException{
		while(elem!=null){
			waitedProducers++;
			this.wait();
			waitedProducers--;
		}
		elem=newElement;
		if(waitedConsumers>0){
			this.notify();
		}
		
	}
	public synchronized int get() throws InterruptedException {
		while(elem==null){
			waitedConsumers++;
			this.wait();
			waitedConsumers--;
		}
		Integer result=this.elem;
		this.elem=null;
		if(waitedProducers>0){
			this.notify();
		}
		return result;
	}
}
