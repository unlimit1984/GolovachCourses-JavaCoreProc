package ru.unlimit.golovach.javacore.lab14.thread;

public class Lab14_5_destroy_stop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					
					if(Thread.currentThread().isInterrupted()){
						System.out.println("Inner interrupted");
					}
					else{
						System.err.println("Inner OK");
					}
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					try {
						System.out.println("!");
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
						//Доделать работу и выйти из цикла 
						break;
					}
				}
				
			}
		});
		
//		Thread me = Thread.currentThread();
//		thread.start();
//		me.sleep(100);
//		thread.interrupt();
//		me.interrupt();
//		System.err.println("thread interrupted status: "+thread.isInterrupted());
//		System.err.println("me interrupted status: "+me.isInterrupted());
//		//thread.destroy();//устарел, выдает ошибку
//		thread.stop();//все еще работает, но не надо использовать


		Thread me = Thread.currentThread();
		thread2.start();
		me.sleep(100);
		thread2.interrupt();
		me.interrupt();
		System.err.println("thread2 interrupted status: "+thread2.isInterrupted());
		System.err.println("me interrupted status: "+me.isInterrupted());
		//thread.destroy();//устарел, выдает ошибку
		thread2.stop();//все еще работает, но не надо использовать

	
	}

}
