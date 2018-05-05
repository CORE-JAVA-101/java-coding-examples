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
		// A14.main(null);
		// A15.main(null);
		// A16.main(null);
		// A17.main(null);
		// A18.main(null);
	}
}

class A19
{
       	
}
class A18 {
	public static void main(String[] args) {
		int r = m1(10);
		System.out.println(r);
	}

	private static int m1(int x) {
		try {
			if (x == 0)
				throw new Exception("EX");
			if (x == 10)
				throw new RuntimeException("RE");
			return 50;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			return 20;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 30;
		}
		// return 40;// CE, unreachable code because of return 50
	}
}

class A17 {// return type of finally
	public static void main(String[] args) {
		int r = m1(0);
		System.out.println(r);
	}

	private static int m1(int x) {
		try {
			if (x == 0)
				throw new ArithmeticException("AE");
			return 10;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			return 20;
		} finally {
			return 30;
		}
	}
}

class A16 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		try {
			System.out.println(10);
		} finally {
			System.out.println(20);
		}
		// finally {// multiple finally not allowed
		//
		// }
	}
}

class A15 {// exception order in catch
	public static void main(String[] args) {
		m1(0);
	}

	private static void m1(int x) {
		try {
			if (x == 10)
				throw new Exception("EX");

			if (x == 20)
				throw new Throwable("TH");

			if (x == 30)
				throw new Error("ERROR");

			if (x == 0)
				throw new ArithmeticException("AE");

		} catch (RuntimeException e) {
			handler(e);
		} catch (Exception e) {
			handler(e);
		} catch (Error e) {
			handler(e);
		} catch (Throwable e) {
			handler(e);
		}
	}

	private static void handler(Throwable e) {
		System.out.println(e.getMessage());
	}
}

class A14 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		try {
			try {
				throw new Exception("xyz");
			} finally {
				System.out.println("1");
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("2");
		}
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
												// it is not occurred in the
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