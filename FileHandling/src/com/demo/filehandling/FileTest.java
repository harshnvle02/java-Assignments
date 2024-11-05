package com.demo.filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileTest {

	public static void main(String[] args) {
		
		try(FileInputStream fs=new FileInputStream("text1.txt");
			FileOutputStream fo= new FileOutputStream("text1copy.txt");){
			
			int copy=fs.read();
			while(copy!=-1)
			{
				fo.write(copy);
				copy=fs.read();
			}
			System.out.println("Copied file");
		}
		 catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} 
		catch (IOException e) {
				System.out.println(e.getMessage());
			}
	}

}
