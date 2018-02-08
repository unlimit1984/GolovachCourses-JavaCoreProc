package ru.unlimit.golovach.javacore.lab03;

//TODO: обычный односвязный список
class Node{
	public int value;
	public Node next;
	public Node(int value, Node next){
		this.value=value;
		this.next=next;
	}
	
}
//TODO: пустой односвязный список
class EmptyNode{
	public EmptyNode next;
	public EmptyNode(EmptyNode next){
		this.next=next;
	}
	
}

class NodeUtil{
	 
	public static Node add(Node tail, int elem){				//добежать до конца и добавить в конец elem
		//Рекурсивный способ
		return tail.next==null ? tail.next=new Node(elem,null) : add(tail.next,elem);
		
		//итеративный способ
//		Node prev=null;
//		while(tail!=null){
//			prev=tail;
//			tail=tail.next;
//		}
//		tail=new Node(elem,null);
//		if(prev!=null){
//			prev.next=tail;
//		}
//		return tail;
	}
	public static Node remove(Node tail){						//добежать до конца и удаляет последний элемент
		//итеративный
//		if(tail==null){
//			return null;
//		}
//		else if(tail.next==null){
//			Node copy=tail;
//			tail=null;
//			return copy;
//		}
//		else{
//			Node prev=tail;
//			while(tail.next!=null){
//				prev=tail;
//				tail=tail.next;
//			}
//			prev.next=null;
//			return tail;
//		}
		
		//рекурсивный
		if(tail.next.next==null){
			Node remove=tail.next;
			tail.next=null;
			return remove;
		}
		else{
			return remove(tail.next);
		}
	}
	public static Node add(Node tail, int index, int elem){	//имея хвост, добавить elem в индекс index
		//итеративный
//		for(int i=0; i<index-1; i++){
//			tail=tail.next;
//		}
//		Node next=tail.next;
//		Node new_node=new Node(elem,next);
//		tail.next=new_node;
//		return new_node;
		
		//рекурсивный
		return index==1 ? tail.next=new Node(elem,tail.next) : add(tail.next,index-1,elem);
	}
	public static Node remove(Node tail, int index){			//имея хвост, удалить элемент по индексу index
		//итеративный
//		for(int i=0; i<index-1; i++){
//			tail=tail.next;
//		}
//		Node next=tail.next.next;
//		Node remove=tail.next;
//		tail.next=next;
//		return remove;
		
		//рекурсивный
		if(index==1){
			Node remove=tail.next;
			tail.next=tail.next.next;
			return remove;
		}
		else{
			return remove(tail.next,index-1);
		}
	}
}

public class Lab3_1_Node {

	public static void main(String[] args) {
//		Node tail;
//		Node node0=new Node(0, null);
//		Node node1=new Node(1, null);
//		Node node2=new Node(2, null);
//		Node node3=new Node(3, null);
//		
//		node3.next=node2;
//		node2.next=node1;
//		node1.next=node0;
//		tail=node3;
		
//		Node tail;
//		tail=new Node(0,null);
//		tail=new Node(1, tail);
//		tail=new Node(2, tail);
//		tail=new Node(3, tail);
		
//		Node tail= new Node(3,new Node(2,new Node(1,new Node(0,null))));
//		System.out.println(toString(tail));
//		System.out.println(toString2(tail));
//		System.out.println(toString3(tail));
//		
//		Node tail=_(1,2,3,4);
//		System.out.println(toString(tail));
//		
//		//Проверка на зацикленность в круге
//		EmptyNode node0 = new EmptyNode(null);
//		EmptyNode node1 = new EmptyNode(null);
//		EmptyNode node2 = new EmptyNode(null);
//		
//		node0.next=node1;
//		node1.next=node2;
//		node2.next=null;//node2.next=node0;
//		System.out.println(isCycle(node0));
//		
//		//Проверка на существование зацикленности в списке
//		EmptyNode n0 = new EmptyNode(null);
//		EmptyNode n1 = new EmptyNode(null);
//		EmptyNode n2 = new EmptyNode(null);
//		EmptyNode n3 = new EmptyNode(null);
//		EmptyNode n4 = new EmptyNode(null);
//		EmptyNode n5 = new EmptyNode(null);
//		EmptyNode n6 = new EmptyNode(null);
//		EmptyNode n7 = new EmptyNode(null);
//		EmptyNode n8 = new EmptyNode(null);
//		EmptyNode n9 = new EmptyNode(null);
//		EmptyNode n10 = new EmptyNode(null);
//		
//		n0.next=n1;
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
//		n5.next=n6;
//		n6.next=n7;
//		n7.next=n8;
//		n8.next=n9;
//		n9.next=n10;
//		n10.next=n6;//n10.next=null;
//
//		System.out.println(hasCycle(n0));
		
//		Node myNode=generate(6);
//		System.out.println(toString(myNode));
//		
//		Node myNode2=generate_recursion(7);
//		System.out.println(toString(myNode2));
//		
//		Node copy=copy(myNode);
//		System.out.println(toString(copy));
//		
//		System.out.println(isEqual(myNode, myNode2));
//		System.out.println(isEqual(myNode, copy));
		
//		Node myNode=generate(1000);
//		System.out.println(toString3(myNode));
		
//		Node tail1=new Node(3,new Node(4,new Node(100,new Node(200,null))));
//		Node tail2=new Node(1,new Node(1,new Node(10,new Node(11,null))));
//
//		System.out.println(toString(tail1));
//		System.out.println(toString(tail2));
//		System.out.println(toString(merge(tail1,tail2)));
		
		//Задачки
		//написать функцию, которая суммирует элементы в списке
//		Node tail = _(1,8,1,2,3);
//		int result=sum(tail);
//		System.out.println(result);
		//для умножения
//		result=mult(tail);
//		System.out.println(result);
		//поиск максимального элемента
//		result = max(tail);
//		System.out.println(result);
		//посчитать длину списка
//		result = length(tail);
//		System.out.println(result);
		
		//добавление в конец
//		Node tail = _(1,8,1,2,3);
//		System.out.println(toString(tail));
//		System.out.println(toString(NodeUtil.add(tail,189)));
//		System.out.println(toString(tail));
		
		//удаление последнего
//		Node tail = _(1,2,3);
//		System.out.println(toString(tail));
//		System.out.println(toString(NodeUtil.remove(tail)));
//		System.out.println(toString(tail));
		
		//добавление в позицию нового элемента
//		Node tail = _(1,2,4,5);
//		System.out.println(toString(tail));
//		System.out.println(NodeUtil.add(tail,2,3).value);
//		System.out.println(toString(tail));		

		//удаление в позиции index
		Node tail = _(1,2,3,4,5,6);
		System.out.println(toString(tail));
		System.out.println(NodeUtil.remove(tail,5).value);
		System.out.println(toString(tail));

	}
	
	private static int max(Node tail) {
		return tail==null ? 0 : Math.max(tail.value, max(tail.next));
	}
	private static int mult(Node tail) {
		return tail==null ? 1: tail.value*mult(tail.next);
	}
	private static int sum(Node tail) {
		return tail==null ? 0: tail.value+sum(tail.next);
	}
	private static int length(Node tail) {
		return tail==null ? 0: 1+length(tail.next);
	}

	private static int fib(int val){
		return val<2 ? 1 : fib(val-1)+fib(val-2); 
	}
	
	
	//toString для односвязного списка
	public static String toString(Node node){
		String result="";
		while(node!=null){
			result+=node.value+"->";
			node=node.next;
		}
		return result+"*";
	}
	//Короткая рекурсивная форма toString для односвязного списка
	public static String toString2(Node node){
		if(node==null)
			return "*";
		return node.value+"->"+toString(node.next);
		
	}
	//Очень короткая рекурсивная форма toString для односвязного списка
	public static String toString3(Node node){
		return node==null ? "*" : node.value+"->"+toString(node.next);
		
	}
	
	
	//Дополнительные задачка №1 (список в виде круга или нет)
	public static boolean isCycle(EmptyNode tail){
		EmptyNode first = tail;
		for(;;){
			tail=tail.next;
			if(first==tail)
				return true;
			else if(tail==null)
				return false;
		}
	}
	//Дополнительные задачка №2 (есть ли закольцованность в списке)
	public static boolean hasCycle(EmptyNode tail){
		EmptyNode slow=tail;
		EmptyNode fast=tail;
		
		while(true){
			if(fast.next==null){
				return false;
			}
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow){
				return true;
			}
		}
	}
	//Различные конструкторы списков
	public static Node _(int... values){
		Node tail = null;
		for(int k=values.length-1;k>=0;k--){
			tail=new Node(values[k],tail);
		}
		return tail;
	}
	public static Node generate(int length){
		if(length>=0){
			return new Node(length, generate(length-1));
		}
		else
			return null;
	}
	public static Node generate_recursion(int length){
		return length>=0 ? new Node(length, generate(length-1)) : null;
	}
	
	
	//сделать копию списка
	public static Node copy(Node tail){
		return tail==null ? null : new Node(tail.value, copy(tail.next));
	}
	
	//функция сравнения списков
	public static boolean isEqual(Node n1, Node n2){
		if(n1!=null && n2!=null){
			return n1.value==n2.value && isEqual(n1.next, n2.next);
		}
		else return n1==n2;
		
	}
	
	//слияние двух отсортированных списков в один
	public static Node merge(Node tail1, Node tail2){
				
		if(tail1!=null && tail2!=null){
			if(tail1.value<tail2.value){
				return new Node(tail1.value,merge(tail1.next,tail2));
			}
			else{
				return new Node(tail2.value,merge(tail1,tail2.next));
			}
		}
		else{
			return tail1==null ? tail2 : tail1;
		}
		
	}
}
