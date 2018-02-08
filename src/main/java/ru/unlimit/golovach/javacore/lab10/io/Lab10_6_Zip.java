package ru.unlimit.golovach.javacore.lab10.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Lab10_6_Zip {

	public static void main(String[] args) throws IOException {


			FileOutputStream fos = new FileOutputStream("archive.zip"/*"C:/ALL/archive.zip"*/);
			ZipOutputStream zos = new ZipOutputStream(fos);
		
			String file1Name = "file1.txt";
			String file2Name = "folder/file2.txt";
		

			ZipEntry zipEntry = new ZipEntry(file1Name);
			zos.putNextEntry(zipEntry);
			zos.write(file1Name.getBytes(StandardCharsets.UTF_8));
			
			zipEntry = new ZipEntry(file2Name);
			zos.putNextEntry(zipEntry);
			zos.write(file2Name.getBytes(StandardCharsets.UTF_8));
						
			
			zos.closeEntry();
			zos.close();
			fos.close();

			
	}
}
