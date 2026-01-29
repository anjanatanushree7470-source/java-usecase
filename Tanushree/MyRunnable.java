package Tanushree;

public class MyRunnable implements Runnable
 {
	public void run() {
		System.out.println("thread running using runnable");
	}
	public static void main(String[] args) {
		Thread t= new Thread(new MyRunnable());
		t.start();
	
	}

}
