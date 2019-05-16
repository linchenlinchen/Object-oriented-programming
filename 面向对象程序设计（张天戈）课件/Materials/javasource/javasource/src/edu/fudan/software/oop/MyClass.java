package edu.fudan.software.oop;

public class MyClass {

	public interface Comparable<T> {
		int compareTo(T o);
	}

	public static class MyComparableClass implements
			Comparable<MyComparableClass> {
		Integer i;

		@Override
		public int compareTo(MyComparableClass o) {
			return i.compareTo(o.i);
		}
	}

	public static class MyComparableClass1 implements
			Comparable<MyComparableClass1> {

		Integer i;

		@Override
		public int compareTo(MyComparableClass1 o) {
			return i.compareTo(o.i);
		}

	}

	public static void main(String[] args) {
		MyComparableClass m1 = new MyComparableClass();
		MyComparableClass1 m2 = new MyComparableClass1();
		// m1.compareTo(m2);

	}
}
