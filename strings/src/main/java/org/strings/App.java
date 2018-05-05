package org.strings;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// A11.main(null);
		// A12.main(null);
		
		A13.main(null);
	}
}

class A13 {
	public static void main(String[] args) {
		m1();
	}
	private static void m1() {
		String s="null";
		Object o=s;
		StringBuffer s1=(StringBuffer) o;
	}
}

class A12 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {// unequal objects having same hashcode
		String s1 = "Aa";
		String s2 = "BB";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + "," + s2.hashCode());
		System.out.println(System.identityHashCode(s1) + "," + System.identityHashCode(s2));
	}
}

class A11 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String s1 = "home";
		String s2 = "coming";

		String s3 = s1 + s2;
		String s4 = "homecoming";

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + "," + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + "," + System.identityHashCode(s4));
	}
}
