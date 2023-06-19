package com.example.exam.Prac8A;


import java.io.*;
public class ReadAndCopy53 {

	
	public ReadAndCopy53() {
		
	}
	
	String display() throws IOException {
		String basePath  = "C:\\";
		StringBuilder sb = new StringBuilder();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(basePath+"bdlog.txt")));
		String temp = null;
		try {
			int counter = 0;
			
			while((temp=reader.readLine())!=null) {
				sb.insert(counter, temp);
				counter++;
			}
		}
		finally {
			reader.close();

		}
		
		
		FileWriter fw = new FileWriter("C:\\Users\\Aditya\\Desktop\\"+"test.txt");
		fw.write("Adiya");
		fw.close();
		return sb.toString();
		
	}
	public static void main(String[] args) throws IOException {
		ReadAndCopy53 r = new ReadAndCopy53();
		try {
			System.out.println(r.display());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
