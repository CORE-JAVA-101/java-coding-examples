package org.threading;

/**
 * Hello world!
 *
 */
// creating thread
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		B b = new B();
		b.start();

		A a = new A();
		Thread t1 = new Thread(a, "a-1");
		t1.start();

		new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				System.out.println("annnymous thread");
			}

		}.start();

	}
}

class B extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("running extends");
	}

}

class A implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running runnable");
	}

}
