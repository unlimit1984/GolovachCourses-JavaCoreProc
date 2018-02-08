package ru.unlimit.golovach.javacore.lab17.thread;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Lab17_DZ1_FileThreads {

	public static void main(String[] args) throws IOException, InterruptedException {

		final int N = 100;
		URL url = new URL("http://google.ru");
		String fileZip="C:/ALL/tmp/archive.zip";
		String fileZip2="C:/ALL/tmp/archive2.zip";
		
		makeArchive(N, url, fileZip);
		
		int threadCount=10;
		makeThreadArchive(N, url, fileZip2,threadCount);
	}
	private static void makeArchive(final int N, URL url, String fileZip)
			throws FileNotFoundException, IOException {
		long t1=System.currentTimeMillis();
		ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(fileZip)));
		
		for(int i=0;i<N;i++){
			InputStream in = url.openStream();
			ByteArrayOutputStream  buff = new ByteArrayOutputStream();
			copy(in, buff);
			in.close();
			ZipEntry zy=new ZipEntry("zipEntry"+i+".txt");
			putEntrySync(zos,zy,buff.toByteArray());
			buff.close();
		}
		zos.close();
		System.out.println(System.currentTimeMillis()-t1);
	}
	private static void makeThreadArchive(int N, URL url, String fileZip, int threadCount) throws IOException, InterruptedException {
		long t1=System.currentTimeMillis();
		ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(fileZip)));
		
		Thread[] t=new Thread[N];
		for(int i=0;i<N;i++){
			final int j=i;
			t[i]=new Thread(new Runnable() {
				
				@Override
				public void run() {
					InputStream in;
					ByteArrayOutputStream  buff = new ByteArrayOutputStream();
					try {
						in = url.openStream();
						copy(in, buff);
						in.close();
						ZipEntry zy=new ZipEntry("zipEntry"+j+".txt");
						putEntrySync(zos,zy,buff.toByteArray());
					} catch (IOException e) {
						e.printStackTrace();
					}					
				}

			});
			t[i].start();
		}
		for(int i=0;i<N;i++){
			t[i].join();
		}
		zos.close();
		System.out.println(System.currentTimeMillis()-t1);
	}
	private synchronized static void putEntrySync(ZipOutputStream zos, ZipEntry zy, byte[] byteArray) throws IOException {
		System.out.println(zy.getName());
		zos.putNextEntry(zy);
		zos.write(byteArray);
		zos.flush();
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

}
