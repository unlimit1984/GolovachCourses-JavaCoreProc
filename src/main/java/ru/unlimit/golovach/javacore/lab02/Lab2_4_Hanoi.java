package ru.unlimit.golovach.javacore.lab02;

import java.util.Stack;

class MyStack{
	Stack<Integer> stack=new Stack<Integer>();
	String name="default";
	MyStack(String name){this.name=name;}
}

public class Lab2_4_Hanoi {
		static MyStack I	= new MyStack("I");
		static MyStack II	= new MyStack("II");
		static MyStack III	= new MyStack("III");
		
	public static void main(String[] args) {
		I.stack.push(5);
		I.stack.push(4);
		I.stack.push(3);
		I.stack.push(2);
		I.stack.push(1);

		displayStacks();
		
		exchange(I,III,II,I.stack.size());
	}

	private static void displayStacks() {
		System.out.println(I.stack);
		System.out.println(II.stack);
		System.out.println(III.stack);
	}

	private static void exchange(MyStack I, MyStack III, MyStack II, int count) {
		if(count>0){
			exchange(I,II,III,count-1);
			int biggest = I.stack.pop();
			System.out.println("Перекладываем "+biggest+" с " + I.name + " на " + III.name);
			III.stack.push(biggest);
			displayStacks();
			exchange(II,III,I,count-1);
		}
	}

}
