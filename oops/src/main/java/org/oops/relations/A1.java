package org.oops.relations;

public class A1 {
	public static void main(String[] args) {
		test(new P1());
	}

	public static void test(Object obj) {
		System.out.println(obj.getClass().isInstance(obj));
		System.out.println(obj.getClass().isAssignableFrom(C1.class));// obj=P1=C1
																		// valid
		System.out.println(C1.class.isAssignableFrom(obj.getClass()));// C1=P1
																		// invalid
		System.out.println(obj instanceof P1);// true, P1=obj=P1
		System.out.println(obj instanceof C1);// false, C1=obj=P1
		System.out.println(obj instanceof Object);// true, Object=obj=P1
		
		System.out.println(obj.getClass());
		C1 c=null;
		System.out.println(c instanceof C1);// false
		
		P1 p1=new C1();
		C1 c1=new C1();
		
		System.out.println(p1.getClass()==c1.getClass());// true
		System.out.println(p1.getClass().equals(c1.getClass()));// true
		
		System.out.println(I.class.isAssignableFrom(AI.class));// true
		System.out.println(AI.class.isAssignableFrom(I.class));// false
	}
}

interface I
{
	
}
class AI implements I
{
	
}
class P1 {

}

class C1 extends P1 {

}
