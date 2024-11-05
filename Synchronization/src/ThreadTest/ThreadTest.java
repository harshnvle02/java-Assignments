package ThreadTest;
import com.demo.beans.*;
import com.demo.thread.ThreadClass;

public class ThreadTest {

	public static void main(String[] args) {
		
		String msg;
		SyncClass send = new SyncClass();
		
		ThreadClass thread = new ThreadClass("Hii", send);
		ThreadClass thread1 = new ThreadClass("Bye", send);
		
		thread.start();
		thread1.start();
		
		try {
			thread.join();
			thread1.join();
		}catch(Exception e) {
			
			System.out.println("Interrupted");
		}
	}
}
