
package com.xworkz.example;

public class Prime {

	public static void main(String[] args) {
		
//		int i=0;
//		int num=0;
		String primenumbers="";
				
				for(int i=1;i<=100;i++)
				{
					int counter=0;
					for(int num=i;num>=1;num--)
					{
						if(i%num==0)
						{
							counter=counter+1;
						}
					}
					if(counter==2) {
						
				
					primenumbers=primenumbers +i+",";
				
					}
					}
	
System.out.println("prime numbers from 1 to 100");
System.out.println("\n"+primenumbers);
}
}