package edu.fudan.software.oop;

import java.util.Date;
import static java.lang.Math.*;

public class FinalTest {
	static final double PI = 3.14;
	
	final int count;
	
	public FinalTest(int count){
		this.count = count;
	}
	//Date * const date
	final public void func(final Date date){
		date.setHours(10);
	}
	
	void mathTest(){
		sin(0.5);
	}

}
