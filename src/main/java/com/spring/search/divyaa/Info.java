package com.spring.search.divyaa;

import java.io.File;

public class Info {

	public static void main(String[] args) {
		File myObj=new File("E:\\Filef1.txt");
		
		if(myObj.exists()) {
			System.out.println(myObj.getName());
			System.out.println(myObj.getAbsolutePath());
			System.out.println(myObj.canWrite());
			System.out.println(myObj.canRead());
			System.out.println(myObj.length());
			
		}
		else {
			System.out.println("Not exist");
		}
	}
}
