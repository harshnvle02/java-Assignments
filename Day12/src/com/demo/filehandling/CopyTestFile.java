package com.demo.filehandling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CopyTestFile {

	public static void main(String[] args) {
		
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			
			input = new FileInputStream("text");
			output = new FileOutputStream("textCopy");
			
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
		}

	}

}
