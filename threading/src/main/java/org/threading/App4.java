package org.threading;

public class App4 {

	public static void main(String[] args) {

		final App4A app4a = new App4A();

		final App4A app4aa = new App4A();

		Thread t1 = new Thread(app4a, "t1") {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				app4a.m1();
			}

		};

		Thread t2 = new Thread(app4a, "t2") {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				app4a.m2();
			}

		};

		Thread t3 = new Thread(app4a, "t3") {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				app4a.m1();
			}

		};

		Thread t4 = new Thread(app4aa, "t4") {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				app4aa.m2();
			}

		};

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

class App4A extends Thread {
	public synchronized static void m1() {
		System.out.println("m1");
		for (int i = 0; i <= 1000; i++) {

			int res = i % 100;
			if (res == 0) {
				System.out.println("m1: " + i + " and" + Thread.currentThread());
			}
		}
	}

	//public  void m2() {
	public  void m2() {
		// TODO Auto-generated method stub

		System.out.println("m2");
		for (int i = 0; i <= 1000; i++) {

			int res = i % 100;
			if (res == 0) {
				System.out.println("m2 " + i + " and" + Thread.currentThread());
			}
		}

	}
}