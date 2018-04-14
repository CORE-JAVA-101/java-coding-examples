package com.java.primitive.types;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// byte-short-[character]-int-long-float-double
		
		// characterDataType();
		// intDataType();
		// booleanDataType();
		// byteDataType();
		
		
	}

	public static void longDataType()
	{
		long l=10;
		long k='c';
		
	}
	public static void byteDataType() {
		byte b = 127;
		byte c = -128;
		System.out.println(b);
		System.out.println(c);

		System.out.println(b);
		System.out.println(Byte.BYTES);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MAX_VALUE + "," + Byte.MIN_VALUE);

	}

	public static void booleanDataType() {
		boolean b = false;

		System.out.println(b);
		System.out.println(Boolean.TYPE);
		System.out.println(Boolean.valueOf(b));
		System.out.println(Boolean.valueOf("tRue"));
		System.out.println(Boolean.valueOf("fAlse"));
		System.out.println(Boolean.valueOf("xyz"));
	}

	public static void characterDataType() { // 1.0.2
		char c = 'a';
		char d = 'b';
		System.out.println(c);
		System.out.println(d);

		System.out.println(Character.SIZE);
		System.out.println(Character.BYTES);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
	}

	public static void intDataType() { // 1.0
		
		int x = 10;
		System.out.println(x);

		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
