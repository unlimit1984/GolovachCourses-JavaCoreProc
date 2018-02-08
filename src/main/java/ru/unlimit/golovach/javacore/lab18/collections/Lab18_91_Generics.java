package ru.unlimit.golovach.javacore.lab18.collections;

import java.util.Arrays;

public class Lab18_91_Generics {

	public static void main(String[] args) {
		
		_0_Holder h1=new _0_Holder();
		h1.setData("sssd");
		String s = h1.getData();
		System.out.println(s);
		
		
		_1_Holder h2=new _1_Holder();
		h2.setData(new int[]{1,2,3});
		int[] arr = h2.getData();
		System.out.println(Arrays.toString(arr));
		
		
		_2_ObjectHolder h3=new _2_ObjectHolder();
		h3.setData(new int[]{1,2,3,4,5});
		int[] arr2=(int[])h3.getDataO();
		System.out.println(Arrays.toString(arr2));
		
		_2_ObjectHolder h4=new _2_ObjectHolder();
		h4.setData("Test");
		String str=(String)h4.getDataO();
		System.out.println(str);
		
		//Пример ошибки - упаковываем один тип, а пытаемся распаковать другой
//		_2_ObjectHolder h5=new _2_ObjectHolder();
//		h5.setData("Test");
//		int[] arr3=(int[])h5.getDataO();
//		System.out.println(str);
		
		//Generic спасает
		GenericHolder<int[]> holder=new GenericHolder();
		holder.setData(new int[]{10,20,30});
		System.out.println(Arrays.toString(holder.getData()));
		
	}
}

class _0_Holder{
	String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}

class _1_Holder{
	int[] data;

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}
	
}
class _2_ObjectHolder{
	Object data;

	public Object getDataO() {
		return data;
	}

	public void setData(Object o) {
		this.data = o;
	}
	
}

class GenericHolder<T>{
	T t;

	public T getData() {
		return t;
	}
	public void setData(T t) {
		this.t = t;
	}
	
}
