package ru.unlimit.golovach.javacore.lab24.oop;

public class Lab24_8_AnonimClass {

//	public static void main(String[] args) {
//		
//
//	}
}

class Test{
	static int k = (int)System.currentTimeMillis();
	
	public static void main(String[] args) {
		class MyRunnable implements Runnable {
			public void run() {
				System.out.println(k);
			}
		}
		new Thread(new MyRunnable()).start();
	
	}
	
	public void f(){

		//2-одинаковые штуки, 1 раз использовали и забыли,
		//поэтому нет смысла описывать и сохранять class MyRunnable 
		
//		class MyRunnable implements Runnable {
//			public void run() {
//				System.out.println(k);
//			}
//		}
//		new Thread(new MyRunnable()).start();
		
		
//		new Thread(new Runnable() {
//			public void run() {
//				while(true){
//					System.out.println(k);
//				}
//			}
//		}).start();
		
	}
}
