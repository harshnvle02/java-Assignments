package com.demo.thread;

import com.demo.beans.SyncClass;

public class ThreadClass extends Thread{

	private String msg;
	private SyncClass send;
	
	public ThreadClass(String msg, SyncClass send) {
		this.msg = msg;
		this.send = send;
	}
	
	public void run() {
		
		send.sender(msg);
	}
	
}
