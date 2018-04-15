package com.java.primitive.types;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// byte-short-[character]-int-long-float-double are the integral data
		// types

		// characterDataType();
		shortDataType();
		// intDataType();
		// booleanDataType();
		// byteDataType();
		// longDataType();
		// floatDataType();

		// doubleDataType();

	}

	public static void doubleDataType() {
		double d1 = 2.45;

		System.out.println(d1);

		System.out.println(Double.BYTES);
		System.out.println(Double.SIZE);
		System.out.println(Double.MAX_VALUE + "," + Double.MIN_VALUE);
	}

	public static void floatDataType() {
		float fl1 = Long.MAX_VALUE;// 2.3f;

		System.out.println(fl1);

		System.out.println(Float.BYTES);
		System.out.println(Float.SIZE);
		System.out.println(Float.MAX_VALUE + "," + Float.MIN_VALUE);

	}

	public static void shortDataType() {
		short l = 10;

		System.out.println(l);
		System.out.println(Short.BYTES);
		System.out.println(Short.SIZE);
		System.out.println(Short.MAX_VALUE + "," + Short.MIN_VALUE);

	}

	public static void longDataType() {
		long l = 10L;
		long k = 'c';
		long r = 10;
		// int x=100000000000000000;
		long y = 1000000000000000000L;

		System.out.println(y);
		System.out.println(Long.BYTES);
		System.out.println(Long.SIZE);
		System.out.println(Long.MAX_VALUE + "," + Long.MIN_VALUE);

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
