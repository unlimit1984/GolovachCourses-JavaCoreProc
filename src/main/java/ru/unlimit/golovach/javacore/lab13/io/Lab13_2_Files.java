package ru.unlimit.golovach.javacore.lab13.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import javax.swing.filechooser.FileView;

import org.omg.CORBA.VisibilityHelper;

public class Lab13_2_Files {

	public static void main(String[] args) throws IOException {
	
		String path="D:/ALL";
		File file=new File(path);
		//walkRecursive(file);
		//класс MyVisitor криво работает, надо правильно описать
		walkVisitor(new File(path));

	}

	private static void walkRecursive(File rootfile) {
		if(rootfile.isFile()){
			System.out.println("File:      "+rootfile.getAbsolutePath());
		}
		else{
			System.out.println("Directory: "+rootfile.getAbsolutePath());
			for(File f: rootfile.listFiles(new FileFilter() {	
					@Override
					public boolean accept(File pathname) {
						return pathname.length()>15 ? false : true;
					}
				}))
			{
				walkRecursive(f);
			}
		}
		
	}
	private static void walkVisitor(File rootfile) throws IOException {
		Files.walkFileTree(rootfile.toPath(), new MyVisitor());
	}
}
class MyVisitor implements FileVisitor{

	@Override
	public FileVisitResult preVisitDirectory(Object dir,BasicFileAttributes attrs) throws IOException {
		System.out.println("Dir: "+dir);
		return FileVisitResult.SKIP_SUBTREE;
	}

	@Override
	public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
		System.out.println("File: "+file);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
		return null;
	}

	@Override
	public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
		return null;
	}
}
