package com.demo.thread;

import com.demo.beans.Storage;

public class Consumer extends Thread {

private Storage s;
	
	public Consumer(Storage s) {
		this.s = s;
	}
	
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			this.s.get(i);
		}
		
	}
}
