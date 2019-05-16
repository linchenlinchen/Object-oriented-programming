package edu.fudan.software.oop;

public class Max {
	public static Comparable max(Comparable o1, Comparable o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}

	public static <T extends Comparable<T>> T max1(T o1, T o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}

	public static void main(String[] args) {
		System.out.println(max(1, 3));
		System.out.println(max1("1", "3"));
		Integer m1 = (Integer) max(1, 3);
		Integer m2 = max1(1, 3);

	}
}
