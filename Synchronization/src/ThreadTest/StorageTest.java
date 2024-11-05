package ThreadTest;
import com.demo.beans.*;
import com.demo.thread.*;

public class StorageTest {
	public static void main(String[] args) {
		
		Storage store = new Storage();
		Producer prod = new Producer(store);
		Consumer cons = new Consumer(store);
		
		prod.start();
		cons.start();
	}

}
