package com.demo.filehandling;
import java.io.*;

public class TestAppend {
 
	public static void main(String[] args) {
		File f = new File("testCopy.txt");
		FileOutputStream fos = null;
		
		try {
			
			if(f.exists()) {
				
				fos = new FileOutputStream(f, true);
			}else {
				
				fos = new FileOutputStream(f);
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try(FileInputStream fis = new FileInputStream("test.txt"); FileOutputStream fos1 = fos;){
			
			int c=fis.read();
			while(c!=-1) {
				fos1.write(c);
				c=fis.read();
			}
			System.out.println("file copied");
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
