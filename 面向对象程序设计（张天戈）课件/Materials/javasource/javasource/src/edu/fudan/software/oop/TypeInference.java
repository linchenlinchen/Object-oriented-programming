package edu.fudan.software.oop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class TypeInference {
	static <T> T pick(T a1, T a2) {
//		T[] elements = (T[]) new Object[100];
		return a2;
	}
	
	public static void main(String args[]) {
		Serializable s = pick("d", new ArrayList<String>());
		Collection<String> names = Lists.newArrayList();
	}
	
	
}
