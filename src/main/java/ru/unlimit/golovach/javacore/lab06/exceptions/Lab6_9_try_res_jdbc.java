package ru.unlimit.golovach.javacore.lab06.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;


public class Lab6_9_try_res_jdbc {


	public static void main(String[] args) throws Throwable {

		try(Connection conn=DriverManager.getConnection("");
			PreparedStatement stmt=conn.prepareStatement(null);
			ResultSet rs=stmt.executeQuery();)
		{
			System.err.println("try block");
		}
//		catch(Throwable t){
//			System.err.println(Arrays.toString(t.getSuppressed()));
//		}
	}
}
