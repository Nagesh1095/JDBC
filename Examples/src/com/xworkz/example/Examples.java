package com.xworkz.example;

public class Examples {
	
public static void main(String[] args) {
	
	
	String string="shanzzzz";
	int count=0;
	
	for(int i=0;i<string.length();i++) {
		if(string.charAt(i) != ' ')
			count++;
	}
	System.out.println("total number "+count);
}

}
