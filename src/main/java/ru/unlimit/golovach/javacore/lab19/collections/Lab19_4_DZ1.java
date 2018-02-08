package ru.unlimit.golovach.javacore.lab19.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lab19_4_DZ1 {

	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<>();
		//List<Byte> list2 = new ArrayList<>();
		
		FileInputStream fis = new FileInputStream("C:/ALL/tmp/test.txt");
		int data=0;
		while((data=fis.read())!=-1){
			list.add(data);
			//list2.add((byte)data);
		}
		fis.close();
		/*****Sorted list*****/
		Collections.sort(list);
		System.out.println(list);
//		Collections.sort(list2);
//		System.out.println(list2);
				
		
		InputStream is=new IteratorToISAdapter(new ISToIteratorAdapter(new FileInputStream("C:/ALL/tmp/test.txt")));
		List<Integer> list3 = new ArrayList<>();
		while((data=is.read())!=-1){
			list3.add(data);
		}
		is.close();
		Collections.sort(list3);
		System.out.println(list3);
		
	}

}
