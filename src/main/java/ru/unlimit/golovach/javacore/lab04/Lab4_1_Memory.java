package ru.unlimit.golovach.javacore.lab04;

public class Lab4_1_Memory {
	public static void main(String[] args) {
		
		//память не закончится
//		Object[] ref=new Object[1];
//		while(true){
//			Object [] a=new Object[1];
//			Object [] b=new Object[1];
//			
//			a[0]=b;
//			b[0]=a;
//			ref=a;
//		}
		
		//память закончится (можно добавить verbose:gc)
//		Object[] ref=new Object[1];
//		long k=0;
//		while(true){
//			System.out.println(k++);
//			ref=new Object[]{ref, new byte[100_999_99]};
//		}
		System.gc();
		System.out.println();
		System.gc();
	}
}
