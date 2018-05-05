package org.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// A10.main(null);
		// A11.main(null);
		// A12.main(null);
		// A13.main(null);

	}
}

class A14 {
	public static void main(String[] args) {
		// m1();
	}
}

class A13 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {// in multi catch for a given try any-one catch
								// will execute.
		try {
			throw new IOException("IOE");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(10 / 0);// this will go to default exception
										// handler

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());// AE cannot be handled here as
												// it is not occured in the
												// first try block
		}

	}

}

class A12 {
	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		try {
			int x = 10 / 0;
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("ex");
		}
		System.out.println("hi");
	}
}

class A11 {
	public static void m1() {
		try {
			final int x = 10 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(Arrays.toString(e.getStackTrace()));
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		A11.m1();
	}
}

class A10 {
	public static void main(String[] args) {
		System.out.println("ex0");
		int x = 10 / 0;
		System.out.println("ex1");
	}
}