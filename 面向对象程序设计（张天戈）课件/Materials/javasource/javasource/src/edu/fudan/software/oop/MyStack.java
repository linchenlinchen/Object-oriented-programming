package edu.fudan.software.oop;

import java.util.ArrayList;

public class MyStack<T> {

	ArrayList<T> elements = new ArrayList<T>();
	
	public void push(T e){
		elements.add(e);
	}
	
	public T pop(){
		T result = elements.get(elements.size()-1);
		elements.remove(elements.size()-1);
		return result;
	}
	
	public static void main(String[] args){
		MyStack<String> myStringStack = new MyStack<String>();
		myStringStack.push("test");
		String result = myStringStack.pop();
	}
}
