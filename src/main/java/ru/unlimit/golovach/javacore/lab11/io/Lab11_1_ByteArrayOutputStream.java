package ru.unlimit.golovach.javacore.lab11.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Lab11_1_ByteArrayOutputStream {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		for(int i=0; i<10; i++){
			baos.write(new byte[]{0,1,2});
		}

		byte[] bytes = baos.toByteArray();
		System.out.println(Arrays.toString(bytes));
	}

}
