package in.Java8Features;

public class MultiThreading implements Runnable {
	
	public void run() {
		
		System.out.println("Thread is running");
		
	}

	public static void main(String[] args) {
		
		MultiThreading m1 = new MultiThreading();
		 Thread t1 = new Thread(m1);
		t1.start();
		
	}
}
