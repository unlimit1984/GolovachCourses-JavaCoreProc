package ru.unlimit.golovach.javacore;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {

	static int i=0;
	public static void main(String[] args) throws IOException, InterruptedException {
//		int [] a = {4,545,2,56,7,1,4,7,33,5,9,6,88,4,2,3,4};
//		System.out.println(Arrays.toString(a));
		
		
//		String s="abcdef";
//		char[] s1=s.toCharArray();
//		System.out.println(new StringBuilder(s).reverse());

		
//		int[] arr = {1,3,5,7,9,11,16};
//		System.out.println(Arrays.binarySearch(arr, 6));
//		System.out.println(Arrays.binarySearch(arr, -700));
//		System.out.println(Arrays.binarySearch(arr, 700));
//		System.out.println(Arrays.binarySearch(arr, 1));
		
//		System.out.println(null+"wdw");
//		System.out.println(null==null);
//		int i=5;
//		
//		System.out.println(++i + ++i);
		//System.out.println(i);
		
//		System.out.println();
//		
//		int j=1;
//		for(j=1;j<100;j++)
//			++j;
//		System.out.println(null==null);
		
//		String s1="Java";
//		String s2="Java";
//		
//		System.out.println(s1==s2);
		
//	    String s1 = "str";
//        String s2 = new String(s1);
//        String s3 = s1;
//        System.out.println(s1 == s2);//false
//        System.out.println(s1 == s3);//true
//        System.out.println(s1.equals(s2));//true
//        System.out.println(s1.equals(s3));//true
//        System.out.println(s1.intern() == s2.intern());//true
		
//		String s="Мама мыла раму и";
//		String[] str_arr = s.split(" ");
//		List<String> list=new ArrayList<String>(Arrays.asList(str_arr));
//		Collections.reverse(list);
//		String result = list.toString();
//		result=result.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");
//		
//		System.out.println(s);
//		System.out.println(result);
		

//		StringWriter sw=new StringWriter();
//		sw.write(new char[]{'a','b','c'});
//		
//		String s = sw.toString();
//		System.out.println(s);
		
		
		
//		int i=0b111111010000000000111010011001;
//		System.out.println(i);
//		byte b=-0b10000000;
//		System.out.println(b);
		
		
		
//		int countThread=Thread.activeCount();
//		System.out.println(countThread);
//		System.out.println(Thread.currentThread().toString());
		

//		long mil=System.currentTimeMillis();
//		long nano=System.nanoTime();
//		System.out.println(mil/365/24/60/60/1000);
//		
//		System.out.println(Objects.equals(null, null));
//		System.out.println(null==null);
		
//		Object o=null;
//		System.out.println(o==null);
//		System.out.println(o.equals(null));
		
//		Object o2=new Object();
//		System.out.println(o2.equals(null));		
//		System.out.println();
		
		
//		File file = new File("D:/CloudMailRu");
//		printRealPath(file);
		
		//Сравнить два видеофайла
		//Основная проблема, как удалить имя файла из байтов данных
//		File f1 = new File("D:/Films/Tom_&_Jerry/TOM-1/01. За что наказали кота.avi");
//		FileInputStream fis1 = new FileInputStream(new File("D:/Films/Tom_&_Jerry/TOM-1/01. За что наказали кота.avi"));
//		ByteArrayOutputStream buff1 = new ByteArrayOutputStream();
//		copyBuff(fis1,buff1);//copy(fis1,buff1);
//		fis1.close();
//		
//		FileInputStream fis2 = new FileInputStream("D:/Films/Tom_&_Jerry/TOM-1/01. За что наказали кота — копия.avi");
//		ByteArrayOutputStream buff2 = new ByteArrayOutputStream();
//		copyBuff(fis2,buff2);//copy(fis2,buff2);
//		fis2.close();
//		System.out.println(buff1.toByteArray().equals(buff2.toByteArray()));
		
		//Такое сравнение сравнивает только названия файлов
		//System.out.println(Objects.equals(f1, f2));		

		
//		List<? super Integer> intList = new ArrayList<Object>();
//		List<Integer> intList2 = new ArrayList<Integer>();
		
		
		//замена подстроки в середину файла
//		String file1 = "C:/ALL/tmp/1.txt";
//		String file2 = "C:/ALL/tmp/2.txt";
//		String old_str = "Word";
//		String new_str = "Space";
//		
//		//заменяет все вхождения old_str на new_str
//		replace_string(old_str,new_str, new FileInputStream(file1),new FileOutputStream(file2),true);
//		//заменяет первое вхождение old_str на new_str
//		replace_string(old_str,new_str, new FileInputStream(file1),new FileOutputStream(file2),false);
		
		
//		Double d = new Double(null);
//		System.out.println(d);
		
		
//		int i=0;
//		System.out.println(i+++i+++i++);
		
		//new B();
		
		new Object().wait();
		
	}
	private static void replace_string(String old_str,String new_str,
									   FileInputStream fis, FileOutputStream fos,boolean all) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
		BufferedReader br = new BufferedReader(isr);
		String thisLine;
		while((thisLine=br.readLine())!=null){
			
		}
			
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
		copy(fis,baos);
		fis.close();
		
		String s = new String(baos.toByteArray(),StandardCharsets.UTF_8);
		if(all){
			s = s.replaceAll(old_str, new_str);
		}else{
			s = s.replaceFirst(old_str, new_str);
		}
		
		fos.write(s.getBytes(StandardCharsets.UTF_8));
		fos.close();
		
		
	}
	private static void copy(InputStream src, OutputStream dest) throws IOException {
		while(true){
			int b = src.read();
			if(b!=-1)
				dest.write(b);
			else
				break;
		}
	}
	private static void copyBuff(InputStream src, OutputStream dest) throws IOException {
		byte[] buff=new byte[1024];
		int count;
		while((count=src.read(buff))!=-1){
			dest.write(buff,0, count);
		}
	}
	private static void printRealPath(File file) {
		if(file.isFile()){
			if(file.getPath().length()>255){
				System.out.format("%5d  Length %5d,file: %s",i++,file.getPath().length(),file.getPath());
				System.out.println();
			}
		}
		else if(file.isDirectory()){
			for(File f: file.listFiles()){
				printRealPath(f);
			}
		}
	}

}

class A{
	int i;
	void setI(int i){
		this.i=i;
	}
}
class B extends A{
	public B(){
		this.setI(6);
	}
}