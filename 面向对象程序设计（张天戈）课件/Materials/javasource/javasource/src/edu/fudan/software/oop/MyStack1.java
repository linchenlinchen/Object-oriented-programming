package edu.fudan.software.oop;

import java.util.ArrayList;

public class MyStack1<T> {

	ArrayList<T> elements = new ArrayList<T>();
	
	public void push(T e){
		new Object();
		elements.add(e);
	}
	
	public T pop(){
		T result = elements.get(elements.size()-1);
		elements.remove(result);
		return result;
	}
	
	public static void main(String[] args) {
		MyStack1<String> stringStack = new MyStack1<String>();
		stringStack.push("test");
		String result = stringStack.pop();
		System.out.println(result);
		
		MyStack1<Integer> intStack = new MyStack1<Integer>();
		intStack.push(1);
		Integer intResult = intStack.pop();
		
		
		
	}
}
