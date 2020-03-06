package com.example.demo.model;

import java.util.Scanner;

public class sumatoria {

	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long  numero = read.nextInt();
		long result = (numero * (numero + 1)) / 2;
		System.out.print(result);
	}

}
