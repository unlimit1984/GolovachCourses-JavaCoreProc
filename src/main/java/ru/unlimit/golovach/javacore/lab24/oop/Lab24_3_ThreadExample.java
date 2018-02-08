package ru.unlimit.golovach.javacore.lab24.oop;


public class Lab24_3_ThreadExample {

	class A{
		class B{
			class C{
				class D{
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		Thread.State state = thread.getState();
		
		
	}

	public void f(){
		A a = new A();
		A.B b = a.new B();
		
	}
}
