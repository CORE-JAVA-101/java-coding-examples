package org.threading;

// deadlock
public class App2 {

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				System.out.println("thread1");
				synchronized (String.class) {
					System.out.println("thread1 string lock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (Object.class) {
						System.out.println("thread1 object lock");
					}
				}
			}

		};

		Thread t2 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				System.out.println("thread2");
				synchronized (Object.class) {
					System.out.println("thread2 object lock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (String.class) {
						System.out.println("thread2 string lock");
					}
				}
			}

		};

		t1.start();
		t2.start();
	}
}
