package com.java.wrapper.types;

public class App {
	/**
	 * 
	 * <p>
	 * String is not a wrapper type. Justify.
	 * 
	 * That's different for the primitive wrappers: they have been designed only
	 * to wrap a primitive, to adapt a java primitive to java.lang.Object . No.
	 * String is not a wrapper class, simply because there is no parallel
	 * primitive type that it wraps.
	 * 
	 */
	public static void main(String[] args) {

		// Serializable and Comparable

		// booleanDataType();
		// characterDataType();
		// shortDataType();

		intDataType();
	}

	private static void intDataType() {

		int x = 2122;

		Integer xx = new Integer(x);

		System.out.println(xx.intValue());
		System.out.println(xx.getClass());

		System.out.println(Integer.bitCount(x));
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("101", 2));
		System.out.println(Integer.valueOf(10));
	}

	public static void shortDataType() {

		short x = 10;

		Short xx = new Short(x);
		System.out.println(xx.intValue());
		System.out.println(xx.byteValue());
		System.out.println(xx.longValue());
		System.out.println(xx.floatValue());
		System.out.println(xx.doubleValue());
		System.out.println(xx.shortValue());
		System.out.println(xx.toString());

		System.out.println(Short.parseShort("100", 2));
		System.out.println(Short.parseShort("1000"));

		System.out.println(Short.reverseBytes(x));

		System.out.println(Short.valueOf(x));
		System.out.println(Short.valueOf("23"));
		System.out.println(Short.valueOf("1574", 8));
	}

	public static void booleanDataType() {
		boolean b1 = true;
		Boolean b = new Boolean(b1);
		Boolean strBoolean = new Boolean("TrUe");

		System.out.println(b);
		System.out.println(strBoolean);

		System.setProperty("myVal", "true");
		System.out.println(Boolean.getBoolean("myVal")); // returns true as the
															// system property
															// // myVal exists
	}

	public static void characterDataType() {
		char c = 49; // primitive
		Character ch = new Character(c);

		System.out.println(ch.charValue());
		System.out.println(ch.compareTo('1')); // returns the difference
		System.out.println(Character.isDigit(c));
		System.out.println(Character.valueOf('$'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.isLetterOrDigit('e')); // 1 , #
		System.out.println(Character.isLetter('e')); // 1, #
		System.out.println(Character.isJavaLetter('A'));
		System.out.println(Character.isJavaIdentifierStart('_'));
	}

}
