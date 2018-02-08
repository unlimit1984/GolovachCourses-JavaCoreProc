package ru.unlimit.golovach.javacore.lab12.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Lab12_1_DZ {

	//1. Добавить корректную работу IOException
	//(в любом случае все открытые потоки должны быть закрыты)
	
	//2. В случае, если исключение помешало скопировать данные,
	//должно быть выброшено исключение
	
	//3. В случае, если исключение помешало скопировать данные,
	//удалите недописанный файл new File().delete()
	
	//4. В случае, если не удается удалить недописанный файл,
	//создайте исключение new IOException ("Can't delete file"+filename) и
	//добавить его в supressed 1-го исключения
	
	//про удаление файла:
	//а - плохо, нет второго файла
	//б - плохо, второй файл частично создался
	//в - плохо, второй файл создан
	//свести все три плохо к одному
	
	//5. Перепишите на чтение/запись массивами - усложнение в том,
	//что вычитая данные в byte[] buffer, необходимо найти в нем диапазоны,
	//не включающие 0 и делать запись этих диапазонов write(byte[], int,int)
	
	//6. Ваш метод фильтрации должен работать для любого размера буфера вычитки
	//(размер буфера - это параметр)
	public static void main(String[] args) throws IOException{
		
		String path="C:/ALL/tmp/file.tmp";
		String out_path = "C:/ALL/tmp/file.tmp2";
		
		FileOutputStream f = new FileOutputStream(path);
		f.write(
				new byte[]{	0,
							1,2,
							0,
							3,4,
							0,
							5,6,
							7,8,9,10,
							11,12,13,14,
							0,
							0,
							0,
							15});
		f.flush();
		f.close();
		
		try(	FileInputStream in=new FileInputStream(path);
				FileOutputStream out = new FileOutputStream(out_path,false)){
			//copy(in,out);
			//filter(in,out,2);
			filterClass(in,out,7);
			
			//throw new IOException("Ошибка копирования: 2-й файл создан");
		}
		catch(FileNotFoundException fEx){//исключение при создании ресурсов
			throw new IOException("Ошибка копирования: не созданы ресурсы",fEx);
		}
		catch(IOException e){//исключение во время копирования
			try {
				boolean is_deleted = new File(out_path).delete();
				if(!is_deleted){
					e.addSuppressed(new IOException("Can't delete file: "+out_path));
				}
				throw e;
			} catch (IOException e1) {
				throw e1;
			} catch(SecurityException sEx){
				e.addSuppressed(sEx);
			}
		}	
		
		printBytes(new FileInputStream(path));
		printBytes(new FileInputStream(out_path));
	}

	private static void printBytes(FileInputStream in) throws IOException {
		while(true){
			int b=in.read();
			if(b!=-1){
				System.out.print(b+" ");
			}
			else{
				System.out.println();
				break;
			}
		}
		
		
	}

	private static void copy(FileInputStream in, FileOutputStream out) throws IOException {
		if(true){
			//throw new IOException("Ошибка копирования: нет 2-го файла");
		}
		while(true){
			int b=in.read();
			if(b>0){
				out.write(b);
				//throw new IOException("Ошибка копирования: 2-й файл недописан");
			}
			else if(b==-1){
				out.flush();
				break;
			}
		}
	}
	
	private static void filter(FileInputStream in, FileOutputStream out, int buffSize) throws IOException {
		final int ZERO_STATE = 0;
		final int NUMBERS_STATE = 1;
		byte buff[] = new byte[buffSize];
		int count;
		while((count=in.read(buff))!=-1){
			int state = ZERO_STATE;
			int start=0;
			int len=0;
			for(int index=0; index<count; index++){
				switch(buff[index]==0 ? ZERO_STATE : NUMBERS_STATE){
					case ZERO_STATE:
						if(state==ZERO_STATE){	//0->0
						}else{					//1->0
							out.write(buff, start, len);
							state=ZERO_STATE;
						}
						break;
					case NUMBERS_STATE:
						if(state==ZERO_STATE){	//0->1
							start=index;
							len=1;
							state=NUMBERS_STATE;
						} else{					//1->1
							len++;
							state=NUMBERS_STATE;
						}
						break;
				}
			}
			if(state==ZERO_STATE){
			}else{
				out.write(buff, start, len);
			}
			out.flush();
		}
	}
	public static void filterClass(	FileInputStream in,
									FileOutputStream out,
									int buffSize) throws IOException {
		
		byte buff[] = new byte[buffSize];
		int count;
		while((count=in.read(buff))!=-1){
			State state = new Zero(out);
			for(int index=0; index<count; index++){
				state = state.next(buff[index]);
			}
			state.finish();
		}
	}
}
