package ru.unlimit.golovach.javacore.lab16.thread;

public class Lab16_WaitStatus {

	
	/*что будет с программой:
	1)завершит работу
	2)зависнет
	3)50 на 50
	https://www.youtube.com/watch?v=9HYywmFtoE4&index=74&list=PLwcDaxeEINadGe-w5FWL9Aho5EqwsHCsq
	https://youtu.be/9HYywmFtoE4?list=PLwcDaxeEINadGe-w5FWL9Aho5EqwsHCsq&t=674
	*/
	volatile static boolean  waitStatus = true;
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				waitStatus = false;
				while(true){
					for(int k=0; k<1000_000; k++){}//закомментируй и зависнет
					try{
						for(int k=0; k<1000_000; k++){}
					}catch (Throwable e){}
				}
			}
		});
		
		thread.setDaemon(false);//а так: thread.setDaemon(true);
		thread.start();
		while(waitStatus);
		thread.stop();
	}

}
