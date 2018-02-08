package ru.unlimit.golovach.javacore.lab20.collections;

import java.util.Collection;
import java.util.HashSet;

public class Lab20_3_speed_hash {

	public static void main(String[] args) {
//		Collection<PersonB> coll = new HashSet<>();
//		long t0 = System.nanoTime();
//		for (int k = 0; k < 10_000; k++) {
//			coll.add(new PersonB("", k));
//		}
//		long t1 = System.nanoTime();
//		System.out.println("dT(add)="+(t1-t0));
//		
//		t0 = System.nanoTime();
//		coll.contains(new PersonB("", -1));
//		t1 = System.nanoTime();
//		System.out.println("dT(contains)="+(t1-t0));

	
		Collection<PersonC> coll = new HashSet<>();
		long t0 = System.nanoTime();
		for (int k = 0; k < 10_000; k++) {
			coll.add(new PersonC("", k));
		}
		long t1 = System.nanoTime();
		System.out.println("dT(add)="+(t1-t0));
		
		t0 = System.nanoTime();
		coll.contains(new PersonC("", -1));
		t1 = System.nanoTime();
		System.out.println("dT(contains)="+(t1-t0));
	
	}
}
