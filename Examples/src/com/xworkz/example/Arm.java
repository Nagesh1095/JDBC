package com.xworkz.example;

public class Arm {
	public static void main(String[] args) {

		int n = 153;
		String string = Integer.toString(n);
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			sum += Math.pow(Integer.parseInt(string.substring(i, i + 1)), string.length());
		}
		System.out.println(sum);

	}
}
