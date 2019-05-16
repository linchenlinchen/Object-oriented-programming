package edu.fudan.software.oop;

import java.util.ArrayList;
import java.util.Collection;

public class Erasure {
	@SuppressWarnings("unused")
	static <T> T Test(T a1) {
		
		T[] elements = (T[]) new Object[100];
		Collection<T> arrays = new ArrayList<T>();

		return a1;
	}

}
