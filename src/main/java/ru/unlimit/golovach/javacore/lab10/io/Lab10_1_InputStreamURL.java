package ru.unlimit.golovach.javacore.lab10.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Lab10_1_InputStreamURL {

	public static void main(String[] args) throws IOException{
		URL url = new URL("http://google.ru");
		InputStream in = url.openStream();
		
		ByteArrayOutputStream  buff = new ByteArrayOutputStream();
		
		copy(in, buff);
		
		byte[] rawData =  buff.toByteArray();
		String html=new String(rawData,"ascii");
		System.out.println(html);

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
