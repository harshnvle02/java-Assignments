package com.demo.test;
import com.demo.thread.*;
import com.demo.beans.*;
public class TestSearch {

	public static void main(String[] args) {
		
		String[] str = {"hii","bye","hello"};
		MySearchThreads[] sThread = new MySearchThreads[str.length];
		SearchData sdata = new SearchData();
		
		for(int  i = 0; i < str.length; i++) {
			
			sThread[i] = new MySearchThreads(sdata, str[i]);
			sThread[i].start();
		}
		for(int i=0; i<str.length; i++) {
			try {
				sThread[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
