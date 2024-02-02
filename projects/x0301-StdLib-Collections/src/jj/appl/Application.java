package jj.appl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jj.util.log.Log;

public class Application {

	// Einiges ist bereits in Java 9 definiert - aber noch weitgehend unbekannt...
	
	public static void main(String[] args) {
		demoArraysAsList();
		demoListOf();
		demoSetOf();
		demoMapOf();
		demoMapOfEntries();
		demoCopyOf();
		demoCollectorsToUnmodifiableList();
		demoCollectorsToUnmodifiableMap();
	}

	static void demoArraysAsList() {
		Log.logMethodCall();
		List<Integer> list = Arrays.asList(1, 2, 3);
		list.add(20);
	}
	static void demoListOf() {
		Log.logMethodCall();
		final List<Integer> list = List.of(1, 2, 3);
		list.forEach(System.out::println);
		System.out.println(list.getClass());
		System.out.println(list instanceof Serializable);
		try {
			list.add(4);
		}
		catch (final Exception e) {
			System.out.println(e);
		}
		final List<Integer> list2 = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);  // E e1, E e2, ... E e10 
		final List<Integer> list3 = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);  // E... elements
		System.out.println(list2);
		System.out.println(list3);
	}

	static void demoSetOf() {
		Log.logMethodCall();
		final Set<String> set = Set.of("red", "green", "blue");
		set.forEach(System.out::println);
		System.out.println(set.getClass());
		System.out.println(set instanceof Serializable);
		try {
			set.remove("red");
		}
		catch (final Exception e) {
			System.out.println(e);
		}
	}

	static void demoMapOf() {
		Log.logMethodCall();
		final Map<Integer, String> map = Map.of(42, "red", 43, "green", 44, "blue");
		map.forEach((k, v) -> System.out.println(k + " => " + v));
		System.out.println(map.getClass());
		System.out.println(map instanceof Serializable);
		try {
			map.put(45, "yellow");
		}
		catch (final Exception e) {
			System.out.println(e);
		}
	}

	static void demoMapOfEntries() {
		Log.logMethodCall();
		final Map<Integer, String> map = Map.ofEntries(
				Map.entry(77, "RED"), Map.entry(78, "GREEN"), Map.entry(79, "BLUE"));
		map.forEach((k, v) -> System.out.println(k + " => " + v));
		System.out.println(map.getClass());
		System.out.println(map instanceof Serializable);
		try {
			map.put(45, "yellow");
		}
		catch (final Exception e) {
			System.out.println(e);
		}
	}
	
	static void demoCopyOf() {
		Log.logMethodCall();
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("green");
		list.add("blue");

		List<String> copy = List.copyOf(list);
		System.out.println(copy.size());
		for (String s : copy)
			System.out.println(s);
		try {
			copy.add("yellow");
		}
		catch (UnsupportedOperationException e) {
			System.out.println("expected: " + e);
		}

		// dito für Set und Map
	}

	static void demoCollectorsToUnmodifiableList() {
		Log.logMethodCall();

		List<String> list1 = Stream.of("red", "green", "blue").collect(Collectors.toList());
		list1.add("yellow");
		list1.forEach(System.out::println);

		List<String> list2 = Stream.of("red", "green", "blue").collect(Collectors.toUnmodifiableList());
		try {
			list2.add("yellow");
		}
		catch (UnsupportedOperationException e) {
			System.out.println("expected: " + e);
		}
		list2.forEach(System.out::println);

		// dito: toUnmodifiableSet, toUnmodifiableMap
	}

	static void demoCollectorsToUnmodifiableMap() {
		Log.logMethodCall();

		Map<String, Integer> map1 = Stream.of("red", "green", "blue")
				.collect(Collectors.toMap(s -> s, s -> s.length()));
		map1.put("yellow", 5);
		System.out.println(map1);

		Map<String, Integer> map2 = Stream.of("red", "green", "blue")
				.collect(Collectors.toUnmodifiableMap(s -> s, s -> s.length()));
		try {
			map2.put("yellow", 5);
		}
		catch (UnsupportedOperationException e) {
			System.out.println("expected: " + e);
		}

		System.out.println(map2);
	}
}
