package com.spring.search.divyaa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	
	public static void main(String[] args) {


		
		try {
			FileWriter myObj=new FileWriter("E:\\Filef1.txt");
			myObj.write("Java is language");
			myObj.close();
		}
		catch(IOException e) {
			System.out.println(e);
			
			
		}
		
	}
}
