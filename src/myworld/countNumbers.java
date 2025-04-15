package myworld;

import java.util.Scanner;

public class countNumbers {
	
	public class CountTheNumber {
		 
	 	public static void main(String[] args) {
	 		Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter the number:");
	 		int number = sc.nextInt();
	 		int count = 0;
//	 		while(number > 0) {
//	 			number = number/10;
//	 			count++;
//	 		}
//	 		System.out.println("Count:"+count);
	 		
	 		
//	 		for(int i=number;i>0;i=i/10)
//	 				{
//	 					count++;
//	 			 		}
//	 				System.out.println("Count:"+count);
//	 			 		

	 		do {
	 			number = number/10;
	 			count++;
	 			
	 		}while(number > 0);
	 		System.out.println("Count:"+count);
	 		
	 	 		
	 		
	 	}
	 	}
}
