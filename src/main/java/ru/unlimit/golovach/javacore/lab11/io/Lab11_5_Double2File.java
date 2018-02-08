package ru.unlimit.golovach.javacore.lab11.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Lab11_5_Double2File {

	public static void main(String[] args) throws IOException {

		DataOutputStream/*DataOutput*/ out =
				new DataOutputStream(
						new GZIPOutputStream(//можно убрать
							new SniferOutput(
								new BufferedOutputStream(//можно убрать
									//new FileOutputStream("C:/ALL/tmp/file.tmp"));
									new FileOutputStream(
											new File("C:/ALL/tmp/file.tmp")),256))));
		for(int i=0;i<1000;i++){
			out.writeDouble(/*-123.456*/Math.random());
		}
		out.flush();
		out.close();
		
		DataInput in =
				new DataInputStream(
						new GZIPInputStream(//можно убрать
								new BufferedInputStream(//можно убрать
										new FileInputStream("C:/ALL/tmp/file.tmp")),200));
		
		for(int i=0;i<1000;i++){
			double d=in.readDouble();
			System.out.println(d);	
		}
	}
}
class SniferOutput extends OutputStream{

	private final OutputStream out;
	
	public SniferOutput(OutputStream out){
		this.out=out;
	}
	
	@Override
	public void write(int b) throws IOException {
		//System.out.println("write(b): 1");
		out.write(b);
	}

	@Override
	public void write(byte[] b) throws IOException {
		System.out.println("write(b[]):"+b.length);
		super.write(b);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		System.out.println("write(b[],off,len):"+len);
		super.write(b, off, len);
	}

	public void flush() throws IOException {
		out.flush();
	}

	public void close() throws IOException {
		out.close();
	}
	
}
