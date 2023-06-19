package com.example.exam.Prac5B;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	void findFile(){
		BufferedReader reader  = null;
		String line = "";
		String result = "";
		try {
			reader = new BufferedReader(new FileReader("C:\\bdlog.txt"));
			try {
				while((line = reader.readLine())!=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String [] args) {
		FileHandling f = new FileHandling();
		f.findFile();
	}
}
