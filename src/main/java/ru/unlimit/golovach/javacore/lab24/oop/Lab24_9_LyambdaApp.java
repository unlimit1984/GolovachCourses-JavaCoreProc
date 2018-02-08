package ru.unlimit.golovach.javacore.lab24.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lab24_9_LyambdaApp {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Using simple anonim class");
				
			}
		}).start();
		
		new Thread(() -> System.out.println("Lyambda")).start();

		Arrays.asList("a", "ay","xy").stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.contains("a");
			}
		});
		
		//тоже самое еще короче
		Stream<String> list2 = Arrays.asList("a", "ay","xy").stream().filter((String s)->s.contains("a"));
		
		//еще короче
		Stream<String> list3 = Arrays.asList("a", "ay","xy").stream().filter(s->s.contains("a"));
		

		//Arrays.asList("a", "ay", 0).stream().filter(s->s.contains("a"));
		Arrays.asList("a", "ay","xy").stream().filter(s->s.contains("a")).map(new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return s.length();
			}
		});
		//еще короче
		Arrays.asList("abc", "ayawe","xydedwdwefefewfwef").stream()
			.filter(s->s.contains("a"))
			.map(s -> s.length())
			.forEach(s -> System.out.println(s));
		//ну и полный ахтунг
		Arrays.asList("abc", "ayawe","xydedwdwefefewfwef").stream()
		.filter(s->s.contains("a"))
		.map(String::length)
		.forEach(System.out::println);
		
		
		List<String> aaa = Arrays.asList("1", "2", "3");
		List<String> bbb = Arrays.asList("A", "B", "C");
		
		List<List<String>> result = new ArrayList<>();
		for(String a: aaa){
			for(String b: bbb){
				result.add(Arrays.asList(a,b));
			}
		}
		System.out.println(result);
		//тоже самое с помощью ФУ
		aaa.stream().flatMap(x->bbb.stream().map(y->Arrays.asList(x,y)))
			.forEach(System.out::print);
		
		//pow(Arrays.asList("0","1"),3);
		
	}

//	private static <T> Stream<List<T>> pow(List<T> abc, int k) {
//		if(k==1){
//			return abc.stream().map(t->Arrays.asList(t));
//		}
//		else{
//			return pow(abc,k-1).flatMap(head->abc.stream().map(t->Java8.concat1(head,t)));
//		}
//	}

}
