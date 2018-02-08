package ru.unlimit.golovach.javacore.lab17.thread;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileArchiver {
	
	public static void main(String[] args) throws InterruptedException {

		String path_root="D:/";
		
		Folder folder = new Folder(path_root+"ALL/tmp/files");
		Folder archive_folder = new Folder(path_root+"ALL/tmp/files_archive");
		
		folder.clear();
		archive_folder.clear();
		
		Thread producer0 = new Thread(new FileProducer("a",1,folder));
		Thread producer1 = new Thread(new FileProducer("b",2,folder));
		Thread producer2 = new Thread(new FileProducer("c",3,folder));
		Thread producer3 = new Thread(new FileProducer("d",4,folder));
//		Thread producer4 = new Thread(new FileProducer("e",5,folder));
		
		Thread consumer0 = new Thread(new FileConsumer("arc_a",folder,archive_folder));
		Thread consumer1 = new Thread(new FileConsumer("arc_b",folder,archive_folder));
//		Thread consumer2 = new Thread(new FileConsumer("arc_d",folder,archive_folder));
//		Thread consumer3 = new Thread(new FileConsumer("arc_e",folder,archive_folder));
//		Thread consumer4 = new Thread(new FileConsumer("arc_f",folder,archive_folder));

		long t1 = System.currentTimeMillis();
		producer0.start();
		producer1.start();
		producer2.start();
		producer3.start();
//		producer4.start();
		
		consumer0.start();
		consumer1.start();
//		consumer2.start();
//		consumer3.start();
//		consumer4.start();
		
//		producer0.join();
//		producer1.join();
//		producer2.join();
//		producer3.join();
//		producer4.join();
//		long t2 = System.currentTimeMillis();
//		System.out.println(t2-t1);
		
		Thread.sleep(10000);
		producer0.interrupt();
		producer1.interrupt();
		producer2.interrupt();
		producer3.interrupt();
//		consumer0.interrupt();
//		consumer1.interrupt();
	}

}

class Folder{
	private String path;
	final static int MAX_SIZE = 10;
	final static int MAX_COUNT = 10000;
	int count = 0;
	
	public Folder(String folder) {this.path = folder;}
	
	private HashSet<String> markedFiles = new HashSet<>();
	
	public String getPath() {return path;}
	
	public void clear(){
		File f = new File(path);
		for(File file : f.listFiles()){
			file.delete();
		}
	}

	public synchronized void createFile(String fname) throws IOException {
		if(count<MAX_COUNT){
			count++;
			File f = new File(getPath()+ File.separator + fname);
			f.createNewFile();	
		}
	}
	
	public synchronized Set<String> getFiles() throws InterruptedException{
		HashSet<String> files= new HashSet<>();
		if(count - markedFiles.size() >= MAX_SIZE){
			int i=0;
			File[] all_files = new File(path).listFiles();
			for(File f: all_files){
				if(i<MAX_SIZE && !markedFiles.contains(f.getName())){
					files.add(f.getName());
					markedFiles.add(f.getName());
					i++;
				}
			}
		}
		return files;
	}
	public synchronized void deleteMarkedFiles(Set<String> files){
		for(String f: files){
			if(markedFiles.contains(f)){
				markedFiles.remove(f);
				new File(path+File.separator+f).delete();
				count--;
			}
		}
	}
}

class FileProducer implements Runnable{
	String prefix;
	final int period;
	Folder folder;
	public FileProducer(String prefix, int period, Folder folder) {
		this.prefix = prefix;
		this.period=period;
		this.folder=folder;}

	@Override
	public void run() {
		long i=0;
		while(true){
			try {
				folder.createFile(prefix+i);
				Thread.sleep(period);
				i++;
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" interrupted with prefix "+prefix);
				break;
			} catch (IOException e) {
				System.out.println(Thread.currentThread().getName()+" ошибка ввода/вывода");
				break;
			}
		}
	}
}
class FileConsumer implements Runnable{
	String prefix;
	Folder folder;
	Folder archive;
	public FileConsumer(String prefix, Folder folder, Folder archive) {
		this.prefix = prefix;
		this.folder = folder;
		this.archive = archive;
	}

	@Override
	public void run() {
		long i = 0;
		while(true){
			try {
				Set<String> files = folder.getFiles();
				if(!files.isEmpty()){
					makeArchive(i++, files);
					folder.deleteMarkedFiles(files);
				}
			} catch (InterruptedException e1) {
				System.out.println(Thread.currentThread().getName()+" interrupted with prefix"+prefix);
				break;
			} catch(IOException e2){
				System.out.println(e2);
				break;
			}
		}
	}

	private void makeArchive(long i, Set<String> files) throws FileNotFoundException, IOException {
		ZipOutputStream zos=new ZipOutputStream(
								new FileOutputStream(
										new File(archive.getPath()+File.separator+prefix+i+".zip")));
		for(String f: files){
			FileInputStream fis = new FileInputStream(new File(folder.getPath()+File.separator+f));
			ByteArrayOutputStream  buff = new ByteArrayOutputStream();
			copy(fis, buff);
			fis.close();
			ZipEntry ze=new ZipEntry(f);
			zos.putNextEntry(ze);
			zos.write(buff.toByteArray());
			zos.flush();
			buff.close();	
		}
		zos.close();
	}

	private void copy(InputStream in, OutputStream out) throws IOException {
		int b;
		while((b=in.read())!=-1){
			out.write(b);
		}
	}
}
