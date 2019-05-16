package edu.fudan.software.oop;

import java.util.ArrayList;
import java.util.Collection;

public class FromArrayToCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer v[] = {1,2,3,4,5};
		Collection<Number> numbers = new ArrayList<Number>();
		fromArrayToCollection(v,numbers);

	}

	public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o);
		}
	}
}
