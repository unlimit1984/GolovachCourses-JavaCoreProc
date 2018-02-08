package ru.unlimit.golovach.javacore.lab03;

//TODO:  двусвязное дерево
class DoubleNode{
	int value;
	DoubleNode left;
	DoubleNode right;
	public DoubleNode(int val,DoubleNode l, DoubleNode r){
		this.value=val;
		this.left=l;
		this.right=r;
	}
	public static String toString(DoubleNode node){
		return node==null ? "*" : node.value+"<->"+toString(node.right);
	}
	public static String toStringBack(DoubleNode node){
		return node==null ? "*" : node.value+"<->"+toStringBack(node.left);
	}
}

class DoubleNodeUtil{
	public static DoubleNode getLast(DoubleNode tail){
		return tail.right==null ? tail : getLast(tail.right); 
	}
	public static DoubleNode add(DoubleNode tail, int elem){				//добежать до конца и добавить в конец elem
		//рекурсивный
		return tail.right==null ? tail.right=new DoubleNode(elem,tail,null): add(tail.right,elem); 
	}
	public static DoubleNode remove(DoubleNode tail){						//добежать до конца и удаляет последний элемент
		//рекурсивный
		if(tail.right.right==null){
			DoubleNode remove=tail.right;
			tail.right=null;
			return remove;
		}
		else{
			return remove(tail.right);
		}		
	}
	public static DoubleNode add(DoubleNode tail, int index, int elem){	//имея хвост, добавить elem в индекс index
		//рекурсивный
		if (index==1){
			tail.right=new DoubleNode(elem,tail,tail.right);
			tail.right.right.left=tail.right;
			return tail.right;
		}
		else{
			return add(tail.right,index-1,elem);
		}
	}
	public static DoubleNode remove(DoubleNode tail, int index){			//имея хвост, удалить элемент по индексу index
		//рекурсивный
		if(index==1){
			DoubleNode remove=tail.right;
			tail.right=tail.right.right;
			if(tail.right != null)
				tail.right.left=tail;
			return remove;
		}
		else{
			return remove(tail.right,index-1);
		}

	}
}
public class Lab3_2_DoubleNode {

	public static void main(String[] args) {
//		DoubleNode n1=new DoubleNode(0, null, null);
//		System.out.println(DoubleNode.toString(n1));

//		DoubleNodeUtil.add(n1, 3);
//		DoubleNodeUtil.add(n1, 5);
//		System.out.println(DoubleNode.toString(n1));
//		System.out.println(DoubleNode.toStringBack(n1.right.right));
		

//		DoubleNodeUtil.add(n1, 3);
//		DoubleNodeUtil.add(n1, 5);
//		DoubleNodeUtil.remove(n1);
//		System.out.println(DoubleNode.toString(n1));
//		System.out.println(DoubleNode.toStringBack(n1.right));

//		DoubleNode n1=new DoubleNode(0, null, null);		
//		DoubleNodeUtil.add(n1, 1);
//		DoubleNodeUtil.add(n1, 2);
//		DoubleNodeUtil.add(n1, 3);
//		DoubleNodeUtil.add(n1, 4);
//		DoubleNodeUtil.add(n1, 4, 999);
//		
//		System.out.println(DoubleNode.toString(n1));
//		System.out.println(DoubleNode.toStringBack(DoubleNodeUtil.getLast(n1)));

//		DoubleNode n1=new DoubleNode(0, null, null);		
//		DoubleNodeUtil.add(n1, 1);
//		DoubleNodeUtil.add(n1, 2);
//		DoubleNodeUtil.add(n1, 3);
//		DoubleNodeUtil.add(n1, 4);
//		
//		DoubleNodeUtil.remove(n1, 1);
//		
//		System.out.println(DoubleNode.toString(n1));
//		System.out.println(DoubleNode.toStringBack(DoubleNodeUtil.getLast(n1)));
	
	}

}
