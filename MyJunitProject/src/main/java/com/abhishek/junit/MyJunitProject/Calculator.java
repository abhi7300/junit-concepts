package com.abhishek.junit.MyJunitProject;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public int add(int... args) {

		int result = 0;
		for (int val : args) {
			result += val;
		}
		return result;
	}

	public int subtract(int... args) {

		int result = args[0];

		for (int i = 1; i < args.length; i++) {

			result -= args[i];
		}
		return result;
	}
	
	public int divide(int a,int b){
		
		return a/b;
	}

}
