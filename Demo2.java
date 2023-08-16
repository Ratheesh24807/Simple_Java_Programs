package in.Java8Features;

public class Demo2 extends Thread {
	
	public void run() {
		System.out.println("Thread is running");
	}
	public void run1() {
		System.out.println("Raj is running");
	}

	public static void main(String[] args) {
		
		Demo2 p = new Demo2();
		p.start();;;
	}
	
}
