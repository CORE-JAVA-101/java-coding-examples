package org.threading;

// thread join()
public class App1 {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				System.out.println("thread 1");
			}

		};

		Thread t2 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				System.out.println("thread 2");
			}

		};

		Thread t3 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				System.out.println("thread 3");

				System.out.println("thread 3 running");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t3 completed");

			}

		};

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join(3000); // main waits for 3 seconds and continues further even though t3 is not terminated
		System.out.println("main ending");
	}
}
