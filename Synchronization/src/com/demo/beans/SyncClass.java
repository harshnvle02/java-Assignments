package com.demo.beans;

public class SyncClass {

	public void sender(String msg) {
		
		System.out.println("Sending"+" "+msg);
		try {
			
			Thread.sleep(1000);
		}catch(Exception e) {
			
			System.out.println("Thread interrupted");
		}
		System.out.println("message" +" " +msg+ " "+ "sent");
		
	}
}
