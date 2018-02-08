package ru.unlimit.golovach.javacore.lab20.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Lab20_1 {

	public static void main(String[] args) {
//		Class o = Object.class;
//		Class i = Integer.class;
//		System.out.println(o == i);
//		System.out.println(new Integer(0) instanceof Object);

		
		Set<P> s = new HashSet<>();
		P p1 = new P();
		s.add(p1);
		s.add(p1);
		
		P p2 = new P();
		p2.s="First Change";
		s.add(p2);
		for(P p: s){
			System.out.println(p.hashCode());
		}

		p2.s="Default";
		System.out.println(s);
		for(P p: s){
			System.out.println(p.hashCode());
		}

		
		
		Set<String> s2 = new HashSet<>();
		s2.add("ABC");
		s2.add("ABC");
		System.out.println(s2);

	}

}
class P{
	String s="Default";

	@Override
	public String toString() {
		return "P [s=" + s + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if(obj==null || this.getClass()!=obj.getClass()){
			return false;
		}
		P that = (P)obj;
		return this.s.equals(that.s);
	}
	@Override
	public int hashCode() {
		return s.hashCode();
	}		
}