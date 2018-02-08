package ru.unlimit.golovach.javacore.lab15.thread;

//Примеры как не надо делать
public class Lab15_7_Thread {

	public static void main(String[] args) {
		new MyThread().start();
//		new MyThread(new Runnable() {
//			public void run() {
//				System.out.println("Run");
//			}
//		}).start();
		System.out.println("Bye!" + Thread.currentThread().getName());
		
		//Кривое API, никогда так не делать
		new Thread().start();//поток, который ничего не делает
		new Thread().run();
		new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}).run();//в этом случае вызывается просто метод run объекта Thread,
		//но не run как отдельный поток
		
	}
}
//Так лучше не делать
class MyThread extends Thread{

	
//	public MyThread(Runnable target) {
//		super(target);
//	}

	@Override
	public void run() {
		System.out.println("Hello!" + Thread.currentThread().getName());
	}
	
}