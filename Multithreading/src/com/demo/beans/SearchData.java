package com.demo.beans;
import java.io.*;

public class SearchData {

	public boolean search(String fname, String wrd) {
		
		try(BufferedReader bf = new BufferedReader(new FileReader(fname))){
			
			String s = bf.readLine();
			while(s != null)
			{
				if(s.equals(wrd)) {
					return true;
				}
				s = bf.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
