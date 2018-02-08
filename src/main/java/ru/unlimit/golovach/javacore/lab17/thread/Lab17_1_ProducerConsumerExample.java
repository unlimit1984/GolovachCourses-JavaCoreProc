package ru.unlimit.golovach.javacore.lab17.thread;

public class Lab17_1_ProducerConsumerExample {

	public static void main(String[] args) {
		
//		SingleElementBuffer buffer = new SingleElementBuffer();

		
//		new Thread(new Producer(1,1000,buffer)).start();//comment/uncomment
//		new Thread(new Consumer(buffer)).start();//comment/uncomment
			
//		new Thread(new Producer(1,300,buffer)).start();
//		new Thread(new Producer(100,500,buffer)).start();
//		new Thread(new Producer(1000,700,buffer)).start();
//		
//		new Thread(new Consumer(buffer)).start();
//		new Thread(new Consumer(buffer)).start();
		

//		new Thread(new Producer(1,10,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,11,buffer)).start();//comment/uncomment
//		new Thread(new Consumer(buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,12,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,13,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,12,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,13,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,12,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,13,buffer)).start();//comment/uncomment		
		
		
		//замрет в конце концов, неправильная реализация SingleElementBufferOptimized
//		SingleElementBufferOptimized_A buffer = new SingleElementBufferOptimized_A();
//		new Thread(new Producer(1,10,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,11,buffer)).start();//comment/uncomment
//		new Thread(new Consumer(buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,12,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,13,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,12,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,13,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,12,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,13,buffer)).start();//comment/uncomment

//		SingleElementBufferOptimized_B buffer = new SingleElementBufferOptimized_B();
//		new Thread(new Producer(1,10,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,11,buffer)).start();//comment/uncomment
//		new Thread(new Consumer(buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,12,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,13,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,12,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,13,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,12,buffer)).start();//comment/uncomment
//		new Thread(new Producer(1,13,buffer)).start();//comment/uncomment

		SingleElementBuffer_TimeOut buffer = new SingleElementBuffer_TimeOut();
		new Thread(new ProducerTimed(1,100,buffer,20)).start();//comment/uncomment
		new Thread(new ConsumerTimed(buffer, 15)).start();//comment/uncomment

	}

}
