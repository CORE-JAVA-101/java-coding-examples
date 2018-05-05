package org.oops.relations;

public class A {

	public static void main(String[] args) {

		m1(new Son1());// son1
		m1(new Son2());// father
		m1(null);// son1
	}

	public static void m1(Father f) {// p1
		System.out.println("father");
	}

	public static void m1(Son1 s1) {// p2
		System.out.println("son 1");
	}
	/**
	 * <code>
	public static void m1(Son2 s2) {// p3 will create ambigous error for m1(null)
		System.out.println("son 2");
	}
	</code>
	 */
}

class Father {

}

class Son1 extends Father {

}

class Son2 extends Father {

}
