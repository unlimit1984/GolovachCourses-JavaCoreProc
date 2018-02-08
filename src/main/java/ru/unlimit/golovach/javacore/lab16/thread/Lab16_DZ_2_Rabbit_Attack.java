package ru.unlimit.golovach.javacore.lab16.thread;

public class Lab16_DZ_2_Rabbit_Attack {

	//Кролик рождается каждые 100 миллисекунд проходит 10 шагов(печатает 10 раз) и умирает
	//Написать кролика, которы будет распечатывать себя и стартовать нового кролика
	public static void main(String[] args) throws InterruptedException {
//		for(int k=0;k<Integer.MAX_VALUE;k++){
//			String spaces=spaces(k);
//			Runnable printer = new PrintRunnable(spaces+k, 100);
//			Thread thread=new Thread(printer);
//			thread.start();
//			Thread.sleep(100);
//		}

		new Thread(new Rabit(0,100)).start();
	}

	private static String spaces(int count) {
		String result="";
		for(int i=0;i<count;i++){
			result+=" ";
		}
		return result;
	}

}
