package ru.unlimit.golovach.javacore.lab06.exceptions;


//ЗАДАЧА 1
//Реализовать интерфейс One (Сделать класс OneImpl)
interface One{
	public void call(AutoCloseableFactory factory, TryBody body) throws Throwable;
}

//который работает аналогично реализации OneTWR, но без использования try-with-resources
class OneTWR implements One{

	@Override
	public void call(AutoCloseableFactory factory, TryBody body) throws Throwable {
		try(AutoCloseable  resource = factory.create()){
			body.runBody();			
		}
	}
}
class OneImpl implements One{

	@Override
	public void call(AutoCloseableFactory factory, TryBody body) throws Throwable {
		
		//create A
		AutoCloseable resource = factory.create();
		
		//run body
		try{
			body.runBody();
		}
		catch(Throwable bodyEx){
			try{
				resource.close();
			}
			catch(Throwable closeEx){
				bodyEx.addSuppressed(closeEx);
			}
			throw bodyEx;
		}
		
		//close
		resource.close();
	}
	
}
//где AutoCloseableFactory - это производитель AutoCloseable (заменитель конструктора)
interface AutoCloseableFactory{
	public AutoCloseable create() throws Throwable;
}
//где TryBody - это заменитель тела блока try
interface TryBody{
	public void runBody() throws Throwable;
}

//ЗАДАЧА 2
//Реализовать интерфейс Three (сделать класс ThreeImpl)
interface Three{
	public void call(AutoCloseableFactory factory1,
                     AutoCloseableFactory factory2,
                     AutoCloseableFactory factory3,
                     TryBody body) throws Throwable;
}
//который работает аналогично реализации ThreeTWR, но без использования try-with-resources
class ThreeTWR implements Three{

	@Override
	public void call(	AutoCloseableFactory factory1,
						AutoCloseableFactory factory2,
						AutoCloseableFactory factory3,
						TryBody body) throws Throwable {
		
		try(	AutoCloseable ressourceA=factory1.create();
				AutoCloseable ressourceB=factory2.create();
				AutoCloseable ressourceC=factory3.create()){
			body.runBody();
		}
	}
	
}
//Работа TreeTWR и TreeImpl должна быть аналогична во всех 22-х ситуациях

class TreeImpl implements Three{

	@Override
	public void call(	AutoCloseableFactory factory1,
						AutoCloseableFactory factory2,
						AutoCloseableFactory factory3,
						TryBody body) throws Throwable {
		
		AutoCloseable resourceA = factory1.create();
		AutoCloseable resourceB = null;
		AutoCloseable resourceC = null;
		try{
			resourceB = factory2.create();
		}
		catch(Throwable exNewB){
			//close A
			try{
				resourceA.close();
			}
			catch(Throwable exCloseA){
				exNewB.addSuppressed(exCloseA);
				throw exNewB;
			}
		}
		
		//create C
		try{
			resourceC = factory3.create();
		}
		catch(Throwable exNewC){
			//close B
			try{
				resourceB.close();
			}
			catch(Throwable exCloseB){
				exNewC.addSuppressed(exCloseB);
			}
			//close A
			try{
				resourceA.close();
			}
			catch(Throwable exCloseA){
				exNewC.addSuppressed(exCloseA);
			}
			throw exNewC;
		}
		
		//runBody
		try{
			body.runBody();
		}
		catch(Throwable exBody){
			//close C
			try{
				resourceC.close();
			}
			catch(Throwable exCloseC){
				exBody.addSuppressed(exCloseC);
			}
			//close B
			try{
				resourceB.close();
			}
			catch(Throwable exCloseB){
				exBody.addSuppressed(exCloseB);
			}
			//close C
			try{
				resourceA.close();
			}
			catch(Throwable exCloseA){
				exBody.addSuppressed(exCloseA);
			}
		}
		//close C
		try{
			resourceC.close();
		}
		catch(Throwable exCloseC){
			try{
				resourceB.close();
			}
			catch(Throwable exCloseB){
				exCloseC.addSuppressed(exCloseB);
			}
			try{
				resourceA.close();
			}
			catch(Throwable exCloseA){
				exCloseC.addSuppressed(exCloseA);
			}
			throw exCloseC;
		}
		//close B
		try{
			resourceB.close();
		}
		catch(Throwable exCloseB){
			try{
				resourceA.close();
			}
			catch(Throwable exCloseA){
				exCloseB.addSuppressed(exCloseA);
			}
			throw exCloseB;
		}
		//close C
		resourceA.close();

	}
	
}
public class Lab6_9_DZ1 {
	public static void main(String[] args) throws Throwable {
		
	}
}
