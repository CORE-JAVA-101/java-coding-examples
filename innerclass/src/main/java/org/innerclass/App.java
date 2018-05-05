package org.innerclass;

import org.innerclass.A2.B2;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		concepts();
		problems();
	}

	public static void problems() {
		P1091.main(null);
	}

	public static void concepts() {
		// C1092.main(null); //inner-class
		// C1093.main(null); //inner-class
		// C1094.main(null); //static-nested class
		// C1095.main(null); //static-nested class
		// C1096.main(null); //method-local inner class
		// C1097.main(null);// inner-class

		C1098_1.main(null);// annonymous inner class - subclass approach
		// C1098_2.main(null);// annonymous inner class - interface approach
	}
}

/********************* problems ***************************/
class Outer {
	class Inner {
		public Outer outer1() {
			return Outer.this;
		}

		public Outer outer2() {
			return new Outer();
		}

	}
}

class P1091 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();

		Class c1 = in.outer1().getClass();
		Class c2 = in.outer2().getClass();
		System.out.println(c1 == c2);
	}
}

/*********************** concepts ***********************/
/** 1098_2 **/
class C1098_2 {
	static Hello h = new Hello() {

		public void m1() {
			System.out.println("Hello");
		}
	};

	public static void main(String[] args) {
		h.m1();
	}
}

interface Hello {
	void m1();
}

/** 1098_2 **/
/** 1098_1 **/
class C1098_1 {
	static Demo d = new Demo() {
		@Override
		public void display() {
			super.display();
			System.out.println("annonymous-display()");
		}

	};

	public static void main(String[] args) {
		System.out.println("++++");
		// d.display();
	}
}

class Demo extends Parent {

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Demo()");
	}

	public void display() {
		System.out.println("Demo-display()");
	}
}

class Parent {

	public Parent() {
		super();
		display();
	}

	public void display() {
		System.out.println("Parent-display()");
	}
}

/** end 1098_1 **/
/** 1097 **/
class C1097 {
	public static void main(String[] args) {

	}
}

class A23 {
	class A24 {
		/**
		 * The method m1 cannot be declared static; static methods can only be
		 * declared in a static or top level type
		 */
		// public static void m1()
		{

		}
	}
}

/** end 1097 **/
/** 1096 **/
class C1096 {

	private int x = 10;
	private static int y = 24;

	public void m1() {
		final int z = 90;
		class AA {
			public void m1() {
				System.out.println("hello: " + x);
				System.out.println("hi: " + y);
				System.out.println("bye: " + z);// Cannot refer to the non-final
												// local variable z defined in
												// an enclosing scope
			}
		}
		AA a = new AA();
		a.m1();
	}

	public static void main(String[] args) {
		new C1096().m1();
	}
}

/** end 1096 **/
/** 1095 **/
class C1095 {
	public static void main(String[] args) {
		A2.B2 b2 = new A2.B2();
		b2.display();

		B2 b22 = new B2();
		b22.display();
		System.out.println(b22.getClass());
	}
}

class A2 {
	int x = 10;
	static int z = 23;

	static class B2 {
		int y = 45;

		public void display() {
			// System.out.println("Outer Ns: " + A2.this.x);
			/**
			 * <code>Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			No enclosing instance of the type A2 is accessible in scope</code>
			 */
			System.out.println("Inner: " + this.y);
			System.out.println("Outer Static: " + z);
		}

		public static void show() {
			System.out.println("Static Method: " + z);
		}
	}
}

/** end 1095 **/
/** 1094 **/
class C1094 {
	public static void main(String[] args) {
		A1.B1 b1 = new A1.B1();
		b1.display();
	}
}

class A1 {
	static class B1 {
		int x = 1;
		int y = 2;

		void display() {
			System.out.println("Sum=" + (x + y));
		}
	}
}

/** End 1094 **/
/** 1093 **/
class C1093 {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.display();
		System.out.println("Inner text: " + b.text);
		System.out.println("Outer text: " + a.text);
	}
}

class A {
	public String text = "Hello";

	class B {
		String text = "hi";

		public void display() {
			System.out.println("Outer text: " + A.this.text);
			System.out.println("Inner text: " + this.text);
			System.out.println("Inner text: " + B.this.text);
		}
	}
}

/** End 1093 **/
/** 1092 **/
class CPU { // only public abstract final allowed
	double price;

	// inner class can be public,private,protected

	class Processor {
		double cores;
		String manufacturer;

		double getCache() {
			return 4.3;
		}
	}

	protected class RAM {
		double memory;
		String manufacturer;

		double getClockSpeed() {
			return 5.5;
		}
	}
}

class C1092 {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = cpu.new RAM();
		System.out.println("Processor Cache = " + processor.getCache());
		System.out.println("Ram Clock speed = " + ram.getClockSpeed());
	}
}
/** end 1092 **/