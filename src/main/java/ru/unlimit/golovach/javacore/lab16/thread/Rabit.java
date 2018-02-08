package ru.unlimit.golovach.javacore.lab16.thread;

public class Rabit implements Runnable {

	private int pos;
	private long sleepMillis;
	
	public Rabit(int pos, long ms) {
		this.pos=pos;
		this.sleepMillis=ms;
	}

	@Override
	public void run() {
		for(int k=0;k<3;k++){
			System.out.println(spaces(pos+k)+(pos+k));//делает шаги начиная с pos
			try {
				Thread.sleep(sleepMillis);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
			new Thread(new Rabit(pos+k,sleepMillis)).start();//родил кролика на том же шаге
		}
	}
	
	private String spaces(int count) {
		String result="";
		for(int i=0;i<count;i++){
			result+=" ";
		}
		return result;
	}
}
