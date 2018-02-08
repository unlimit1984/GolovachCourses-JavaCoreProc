package ru.unlimit.golovach.javacore.lab24.oop;

public class Lab24_5_instances {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Outer.Inner inner0 = outer.new Inner();
		Outer.Inner inner1 = outer.new Inner();
		Outer.Inner inner2 = outer.new Inner();
		
		Outer.Inner inner3 = new Outer().new Inner();
		
		Outer2.StaticNested nested = new Outer2.StaticNested("s1");
		Outer2.StaticNested nested2 = new Outer2.StaticNested("s2");
		System.out.println(nested.s);
		System.out.println(nested2.s);
	}
}

class Outer{
	class Inner{
		
	}
}
class Outer2{
	static class StaticNested{
		String s;

		public StaticNested(String s) {
			this.s = s;
		}
	}
}
