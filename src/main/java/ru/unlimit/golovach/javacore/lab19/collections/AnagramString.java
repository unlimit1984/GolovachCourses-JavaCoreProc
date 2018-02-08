package ru.unlimit.golovach.javacore.lab19.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnagramString {
	public final String value;

	public AnagramString(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "AnagramString [value=" + value + "]";
	}

//	@Override
//	public int hashCode() {
//		return 0;
//	}

	@Override
	public boolean equals(Object obj) {
		AnagramString that = (AnagramString) obj;
		
		char[] chA = value.toCharArray();
		char[] chB = that.value.toCharArray();
		Arrays.sort(chA);
		Arrays.sort(chB);
		return Arrays.equals(chA,chB);
	}
	public static void main(String[] args) {
		AnagramString s1 = new AnagramString("ABC");
		AnagramString s2 = new AnagramString("BCA");
		System.out.println("equals : "+s1.equals(s2));
		System.out.println("== "+(s1==s2));
		
		Set<AnagramString> set = new HashSet<>();
		
		set.add(s1);
		set.add(s2);
		//set.add(new AnagramString("BCA"));
		System.out.println("set : "+set);
		System.out.println("contains : "+set.contains(new AnagramString("ACB")));
		
		
	}
	
}
