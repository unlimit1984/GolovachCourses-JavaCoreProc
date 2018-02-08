package ru.unlimit.golovach.javacore.lab25.oop;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Lab25_1_enum {

	public static void main(String[] args) {
		
		Color c0 = Color.R;
		Color c1 = null;
		
		Transport transport = Transport.Car;
		System.out.println(transport);
		
		try {

			UtilityClass instance;
			Constructor<UtilityClass> privateConstructor = UtilityClass.class
					.getDeclaredConstructor();
			privateConstructor.setAccessible(true);

			instance = privateConstructor.newInstance();

			System.out.println("Hello from " + instance);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

}
enum Color{
	R,G,B
}

//Класс с зыкрытым конструктором
final class Size{
	public static Size S = new Size();
	public static Size L = new Size();
	public static Size XL = new Size();
	
	private Size(){
	}
}

class UtilityClass {

	private UtilityClass() {
	}

	public String toString() {
		return this.getClass().getName();
	}
}
enum Planet{
	Mars, Pluton, Earth
}
enum Shape{
	Triangle, Rectangle, Cirle;
	private int area;
	Shape(){
		
	}
}
enum Transport{
	Car(60), Sheep(30), Train(100) ;
	private int speed;
	Transport(int speed){
		this.speed=speed;
	}
	void speedUp(int delta){
		speed+=delta;
	}
//	public String toString(){
//		return this.toString();
//	}
}