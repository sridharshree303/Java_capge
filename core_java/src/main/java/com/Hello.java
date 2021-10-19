package com;

public class Hello {
	//global variable
	int i=7;    //instance variable
	static int k=9; //class variable

	public static void main(String[] args) {
		//local variable
		int j=6;
		
		System.out.println(j);
		System.out.println(k);
		
		//
		Hello h=new Hello();
		
		System.out.println(h.i);
		
		h.add();
	}
	
	void add() {
		System.out.println(i);
	}

}
