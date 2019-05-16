package edu.fudan.software.oop;

import java.util.Collection;

public class WildCardDemo3 {
	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<String>();
		GenericStack<Object> stack2 = new GenericStack<Object>();
		stack2.push("Java");
		stack2.push(2);
		stack1.push("Sun");
		add(stack1, stack2);
	}

	public static <T> void add(GenericStack<? extends T> stack1,
			GenericStack<T> stack2) {
		while (!stack1.isEmpty())
			stack2.push(stack1.pop());
	}

}