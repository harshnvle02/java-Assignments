package com.demo.filehandling;
import java.io.*;

public class TestDataInputStream {

	public static void main(String[] args) {
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("test1.txt"))){
			
			String s =dis.readLine();
			
			while(s != null)
			{
				System.out.println(s);
				s =dis.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
