package com.online.logics;

import java.io.File;
import java.io.FileWriter;

public class FWDemo
{
	FWDemo(){
		try{
			File f = new File("simple.txt");
			FileWriter fw = new FileWriter(f);

			fw.write("Welcome to legal working status ...");
			fw.flush();

			System.out.println("Data is copied into the file");

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String ar[]){
		new FWDemo();
	}
}


