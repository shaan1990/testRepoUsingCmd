package com.pack.sum;

import java.util.function.BiFunction;

interface summation
{
	public int getResult(int a,int b);
	//public void say();
}

public class getSummation {

	public static void main(String[] args)
	{
		//summation s = getSummation::saysomething;
		//s.say();
		
		//BiFunction<Integer, Integer, Integer>adder = getSummation::add; 
		summation s = getSummation::add; 
		int result = s.getResult(10, 20); 
		System.out.println(result);
	}

	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void saysomething()
	{
		System.out.println("This is simple java method reference example project.");
	}
}
