package ru.unlimit.golovach.javacore.lab03;

//TODO:  двусвязное дерево
class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val,TreeNode l, TreeNode r){
		this.value=val;
		this.left=l;
		this.right=r;
	}
}
class Fib{
	public static TreeNode createFibArg(int elem){
		return elem<2
				?
			new TreeNode(elem, null, null)
				:
			new TreeNode(elem,createFibArg(elem-2),createFibArg(elem-1));
	}
	public static TreeNode createFibRes(int elem){
		return elem<2
				?
			new TreeNode(1, null, null)
				:
			new TreeNode(createFibRes(elem-2).value+createFibRes(elem-1).value,createFibRes(elem-2),createFibRes(elem-1));
	}
}
class TreeNodeUtil{
	static int size(TreeNode tail){		//размер дерева (количество узлов)
		return tail==null ? 0 : 1+size(tail.left)+size(tail.right);
	}
	static int height(TreeNode tail){	//глубина дерева (максимальная из всех веток)
		return tail==null ? 0 : 1+Math.max(height(tail.left), height(tail.right));
		
	}
	static int sum(TreeNode tail){		//сумма всех элементов в дереве
		return tail==null ? 0: tail.value+sum(tail.left)+sum(tail.right);
	}
	static int max(TreeNode tail){		//найти максимальный элемент в дереве
		
		return tail==null
				?
			Integer.MIN_VALUE
				:
			Math.max(tail.value, Math.max(max(tail.left), max(tail.right)));
	}
	//Проверить итеративную вставку
	static boolean insertIterate(TreeNode head, int val){
		TreeNode curr = head;
		TreeNode stored = null;
		while(curr!=null){
			stored = curr;
			if(val<curr.value){
				curr = curr.left;
			}
			else if(val>curr.value){
				curr = curr.right;
			}
			else{
				return false;
			}
		}
		if(stored!=null){
			if(val<stored.value){
				stored.left = new TreeNode(val, null, null);
				return true;
			}
			else if(stored.value>val){
				stored.right = new TreeNode(val, null, null);
				return true;
			}
		}
		return false;
	}
	//Проверить итеративную вставку 2
	static boolean insertIterate2(TreeNode head, int val){
		TreeNode curr = head;
		int comp = curr.value-val;
		while(	comp<0 && curr.left!=null ||
				comp>0 && curr.right!=null){
			
			if(comp<0){
				curr = curr.left;
			}
			else{
				curr = curr.right;
			}
			comp = curr.value-val;
		}
		
		if(comp<0){
			curr.left = new TreeNode(val, null, null);
		}
		else if(curr.value>val){
			curr.right = new TreeNode(val, null, null);
		}
		else{
			return false;
		}
		
		return true;
	}
	//Проверить рекурсивную вставку
	static boolean insertRecursive(TreeNode head, int val){
		if(head.value==val){
			return false;
		}
		if(val<head.value){
			if(head.left!=null){
				return insertRecursive(head.left, val);
			}
			else{
				head.left = new TreeNode(val,null,null);
			}
		}
		else if(head.value<val){
			if(head.right!=null){
				return insertRecursive(head.right, val);
			}
			else{
				head.right = new TreeNode(val,null,null);
			}			
		}
		return false;
	}
}

public class Lab3_3_TreeNode {

	
	public static void main(String[] args) {
		
		TreeNode fib4=Fib.createFibArg(4);
		TreeNode fib4res=Fib.createFibRes(6);
		
		System.out.println(TreeNodeUtil.size(fib4));
		System.out.println(TreeNodeUtil.size(fib4res));
		System.out.println(TreeNodeUtil.height(fib4));
		System.out.println(TreeNodeUtil.height(fib4res));
		System.out.println(TreeNodeUtil.sum(fib4));
		System.out.println(TreeNodeUtil.sum(fib4res));
		int temp=0;

		System.out.println(TreeNodeUtil.max(fib4res));
		
		TreeNode maxNode=new TreeNode(3,new TreeNode(5,new TreeNode(4,null,null),new TreeNode(9,null,null)),new TreeNode(2,new TreeNode(10,new TreeNode(6,new TreeNode(5,null,null),new TreeNode(1,null,null)),null),null));
		System.out.println(TreeNodeUtil.max(maxNode));
	}

}
