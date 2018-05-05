package org.oops.initializers;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/**
		 * <pre>
		 * ex1
		 * </pre>
		 */
		// int x=A.x;// static block=0

		/**
		 * <pre>
		 * ex2
		 * </pre>
		 */
		// Class.forName("org.oops.A");// static block=0

		/**
		 * <pre>
		 * ex3
		 * </pre>
		 */
		// new A();
		/**
		 * <code>static block=0
		         non static block=1
		         A()
		   </code>
		 */

		/**
		 * <pre>
		 * ex4
		 * </pre>
		 */
		// A a=(A)Class.forName("org.oops.A").newInstance();// same as above

		/**
		 * <pre>
		 * ex5
		 * </pre>
		 */
		/**
		 * <code>
		 * Class.forName("org.oops.A");//  static block
		   A a=(A)Class.forName("org.oops.A").newInstance();//  only non static block and executed constructor
		   Class.forName("org.oops.A");// nothing
		   new A();// only static block and executed constructor
		 * </code>
		 */

		/**
		 * <pre>
		 * ex6
		 * </pre>
		 */
		// Class.forName("org.oops.B", true, App.class.getClassLoader());//
		// loading...

		/**
		 * <pre>
		 * ex7
		 * </pre>
		 */
		// Class.forName("org.oops.A", false, App.class.getClassLoader());// no
		// output

		/**
		 * <pre>
		 * ex8
		 * </pre>
		 */

		// A.class.getClassLoader().loadClass("org.oops.A1");// no output
		// because
		// of false mode

		/**
		 * <pre>
		 * ex9
		 * </pre>
		 */
		A.m1();/*
				 * static block=0,static m1()
				 */

		/**
		 * <pre>
		 * ex10
		 * </pre>
		 */
		A a = null;
		a.m1();
	}
}

class B {
	static {
		System.out.println("loading...");
	}
}

class A {
	static int x;
	int y;
	{
		y++;
		System.out.println("non static block=" + y);
	}
	static {
		System.out.println("static block=" + x);
	}

	public A() {
		System.out.println("A()");
	}

	public static void m1() {
		System.out.println("static m1()");
	}
}
