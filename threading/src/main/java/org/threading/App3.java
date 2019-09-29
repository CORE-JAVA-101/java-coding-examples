package org.threading;

// thread data inconsistency on non-static variables 
public class App3 {

	public static void main(String[] args) throws InterruptedException {

		final Calculator c = new Calculator();
		Thread t1 = new Thread(c, "t1") {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				c.add(50, 50);
			}

		};

		Thread t2 = new Thread(c, "t2") {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				c.add(60, 60);
			}

		};

		t1.start();
		t2.start();
	}
}

class Calculator extends Thread {
	int x, y;

	// public int add(int x, int y) {
	public synchronized int add(int x, int y) { // object level locking
		this.x = x;
		this.y = y;

		int res = x + y;

		System.out.println(Thread.currentThread() + " " + res);
		return x;
	}

}
