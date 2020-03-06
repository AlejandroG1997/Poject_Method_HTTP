package com.example.demo.model;

import java.util.ArrayList;
import java.util.Scanner;

public class fibo {

	
	
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> date = new ArrayList<String>();
		
		int punto = read.nextInt();
		int contador =0;
		int x = 0;
		int y = 1;
		int result = 0;
		do {
			
			result = x + y;
			x = y;
			y = result;
			
			date.add(Integer.toString(x));
			System.out.print(x + " ");
			//System.out.print(date);
			contador++;
		}while(punto  != contador);
		
		System.out.print(date);
	}

}
