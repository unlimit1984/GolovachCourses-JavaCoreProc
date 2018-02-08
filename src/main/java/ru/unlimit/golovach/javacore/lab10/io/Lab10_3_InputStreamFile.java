package ru.unlimit.golovach.javacore.lab10.io;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

public class Lab10_3_InputStreamFile {

	public static void main(String[] args) throws IOException{
		
		OutputStream  out = new FileOutputStream("d:/ALL/google.html");
		
		//декораторы
		
		//OutputStream outBuff = new BufferedOutputStream(out, 64*1024);
		
		//OutputStream outGZIP = new GZIPOutputStream(out, 64*1024);
		//OutputStream outGZIP = new GZIPOutputStream(out);
		
		//OutputStream outGZIP = new GZIPOutputStream(new BufferedOutputStream(out, 64*1024));
		
		
		new DataOutputStream(
				new GZIPOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(
										new File("")),64*1024)))
		.writeDouble(123.456);
		
	}
}
