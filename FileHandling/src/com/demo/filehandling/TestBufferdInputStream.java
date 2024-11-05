package com.demo.filehandling;
import java.io.*;

public class TestBufferdInputStream {

	public static void main(String[] args) {
		
		File f = new File("testCopy.txt");
		BufferedOutputStream bos= null;
		
		try {
			
			if(f.exists()) {
				
				bos = new BufferedOutputStream(new FileOutputStream(f,true));
			}else {
				
				bos = new BufferedOutputStream(new FileOutputStream(f));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("test1.txt"));
				BufferedOutputStream bos1=bos;){

			int c=bis.read();
			while(c!=-1) {
				bos.write(c);
				c=bis.read();
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}catch(IOException e) {
			System.out.println("input output error occured");
		}
	}
}
