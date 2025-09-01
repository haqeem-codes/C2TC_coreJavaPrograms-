package com.tnsif.day11;

public class Sample {
	public static void main(String[] args) {
		try {
		
		int a[]=new int[5];
		a[0]=11;
		a[1]=2;
		System.out.println(a[6]); // raise exception object
		System.out.println(a[2]); // throw raise exception
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Exception"+e.getMessage());
		}
		System.out.println("Next Line");
		
	}

}
