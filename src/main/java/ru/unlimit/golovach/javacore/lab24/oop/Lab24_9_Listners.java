package ru.unlimit.golovach.javacore.lab24.oop;

public class Lab24_9_Listners {
//	public static void main(String[] args) {
//		
//
//	}
}

class Menu{
	Menu(){
		Mouse.addListner(new MouseListner() {
			public void mouseEvent(int x, int y) {
				mouseMovedX(x);
				mouseMovedY(y);
			}
		});
	}
	void mouseMovedX(int x){}
	void mouseMovedY(int x){}
}

interface MouseListner{
	void mouseEvent(int x, int y);
}

class Mouse{
	static void addListner(MouseListner listner){
		
	}
}

