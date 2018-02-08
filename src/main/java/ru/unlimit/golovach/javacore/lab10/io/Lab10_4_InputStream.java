package ru.unlimit.golovach.javacore.lab10.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Lab10_4_InputStream {

	public static void main(String[] args) throws IOException{
		URL url = new URL("http://google.ru");
		try(	InputStream inet = url.openStream();
				ByteArrayOutputStream  buff = new ByteArrayOutputStream()){
			
			copy(inet, buff);
			
			byte[] rawData =  buff.toByteArray();
			String html=new String(rawData,"ascii");
			System.out.println(html);			
		}
		


	}

	private static void copy(InputStream src, OutputStream dest) throws IOException {
		byte[] buff=new byte[1024];
		int count;
		while((count=src.read(buff))!=-1){
			dest.write(buff,0, count);
		}
	}

}
