package com.spring.search.divyaa;

import java.io.File;
import java.util.Scanner;

public class Reader {

	public static void main(String[] args) {
		
		try {
			
			File myObj=new File("E:\\Filef1.txt");
			
			Scanner myReader=new Scanner(myObj);
			
			while(myReader.hasNextLine()) {
				String data=myReader.nextLine();
				System.out.println(data);
				
				
			}
			
			myReader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
