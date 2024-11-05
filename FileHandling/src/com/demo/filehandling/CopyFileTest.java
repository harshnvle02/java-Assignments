package com.demo.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTest {
public static void main(String[] args) {
		
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			
			input = new FileInputStream("test.txt");
			output = new FileOutputStream("testCopy.txt");
			
			int r = input.read();
			while(r != -1)
			{
				output.write(r);
				r = input.read();
			}
			
		}catch(FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}finally {
			
			try {
				input.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
