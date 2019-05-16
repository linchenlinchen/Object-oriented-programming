package edu.fudan.software.oop;

import java.util.ArrayList;
import java.util.Collection;

public class EqualsTest {

	public static class MyInteger {
		private int i;

		public MyInteger(int i) {
			this.i = i;
		}
		
		@Override
		public boolean equals(Object obj) {
			return i == ((MyInteger)obj).i;
		}
		
		@Override
		public int hashCode() {
			return super.hashCode();
		}
	}

	public static void main(String[] args) {
		MyInteger i1 = new MyInteger(1);
		MyInteger _i1 = new MyInteger(1);
		System.out.println(i1 == _i1);
		System.out.println(i1.equals(_i1));
		
		ArrayList<String> strs = new ArrayList<String>();
		
		for(int i =0; i <strs.size();i++){
			strs.get(i);
			//....
		}
		
		for(String s : strs){
			
		}
		
	}
}
