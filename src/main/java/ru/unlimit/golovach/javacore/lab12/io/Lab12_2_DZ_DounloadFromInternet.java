package ru.unlimit.golovach.javacore.lab12.io;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Lab12_2_DZ_DounloadFromInternet {
	//Данный код не совсем корректный, заканчивает побайтно страницу из интернета и
	//выводит в консоль
	public static void main(String[] args) throws IOException{
		URL url = new URL("http://google.ru");
		
		String path1="C:/ALL/tmp/page1.html";
		String path2="C:/ALL/tmp/page2.html";		
		
		makeFiles(url,path1,path2);
		
//		int b;
//		while((b=in.read())!=-1){
//			System.out.print((char)b);
//			
//		}
//		in.close();		
	}
	private static void makeFiles(URL url, String path1, String path2) throws IOException {
		try(	InputStream in = url.openStream();
				OutputStream out1 = new BufferedOutputStream(new FileOutputStream(path1),10);
				OutputStream out2 = new BufferedOutputStream(new FileOutputStream(path2),10);){
			
			//copyByByte(in, out1, out2);
			copyByArr(in, out1, out2, 10);
			//throw new IOException("Ошибка копирования: оба файла созданы");
		}
		catch(FileNotFoundException fEx){//исключение при создании ресурсов
			throw new IOException("Ошибка копирования: не созданы ресурсы",fEx);
		}
		catch(IOException e){//исключение во время копирования
			try {
				for(String path: new String[]{path1,path2}){
					boolean is_deleted = new File(path).delete();
					if(!is_deleted){
						e.addSuppressed(new IOException("Can't delete file: "+path));
					}
				}
				throw e;
			} catch (IOException e1) {
				throw e1;
			} catch(SecurityException sEx){
				e.addSuppressed(sEx);
			}
		}			
	}
	private static void copyByByte(InputStream in, OutputStream out1,
			OutputStream out2) throws IOException {
		while(true){
			int b;
			if((b=in.read())!=-1){
				out1.write(b);
				out2.write(b);
				throw new IOException("Ошибка копирования: один из файлов недописан");
			}
			else{
				break;
			}
		}
		out1.flush();
		out2.flush();
	}
	private static void copyByArr(InputStream in, OutputStream out1,
			OutputStream out2, int buffer) throws IOException {
		byte buff[] = new byte[buffer];
		int len;
		while((len=in.read(buff))!=-1){
			out1.write(buff,0,len);
			out2.write(buff,0,len);
			throw new IOException("Ошибка копирования: один из файлов недописан");
		}
		out1.flush();
		out2.flush();	
	}
	
	
	
	//Модифицируйте/допишите:
	//1. Не пишите в консоль, а создайте две копии этой страницы
	//C:/ALL/tmp/path1.html,
	//C:/ALL/tmp/path2.html
	//читая из одного OutputStream, записывая в два OutputStream

	
	//2. Добавьте корректную работу IOException
	//(в любом случае все открытые потоки должны быть закрыты)
	
	//3. В случае, если исключение помешало скачать и сохранить данные,
	//должно быть выброшено исключение
	
	//4. В случае, если исключение помешало скопировать данные,
	//удалите оба недописанных файла new File().delete()
	
	//5. В случае, если не удается удалить недописанный файл,
	//создайте исключение new IOexception ("Can't delete file"+filename) и
	//добавить его в supressed 1-го исключения
	
	//6. Перепишите на чтение/запись массивами
}
