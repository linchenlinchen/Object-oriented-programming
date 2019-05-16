package edu.fudan.software.oop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericTest {

	public static void main(String args[]) {
		ArrayList<? extends Number> ns = new ArrayList<Number>();
		ArrayList<Integer> is = new ArrayList<Integer>();
		ns = is;
		System.out.println("here");
		for(Number i : ns){
		}
//		ns.add(new Float(10.0));
	}
	
	
	public interface GeometricObject {
		double getArea();
	}

	public static <E extends GeometricObject> boolean equalArea(E object1,
			E object2) {
		return object1.getArea() == object2.getArea();
	}
}
