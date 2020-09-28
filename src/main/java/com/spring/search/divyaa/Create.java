package com.spring.search.divyaa;

import java.io.File;
import java.io.IOException;


public class Create {

	public static void main(String[] args){

		try {
			
			File myObj=new File("E:\\Filef1.txt");
			
			if(myObj.createNewFile()) {
				System.out.println("File created  "+myObj.getName());
				}
			else {
				
				System.out.println("file already exist");
			}
			
			
			
			
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		
}}

