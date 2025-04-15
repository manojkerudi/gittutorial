package myworld;
import java.util.Scanner;
public class factorial {
	
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter the number:");
 		int number = sc.nextInt();
 //    int fact =1;
 //    for(int i=1;i<=number;i++) {
 //    	fact *=i;
 //    	
 //    }
 //    System.out.println("Factorial of " + number + " is: "+fact);
 		int i = 1;
 		int fact = 1;
 //    while(i <= number) {
 //    	fact = fact * i;
 //    	i++;
 //    }
 //    System.out.println("Factorial of " + number + " is: "+fact);
 
 		do {
 			fact = fact * i;
 			i++;
 		} while (i <= number);
 
 		System.out.println("Factorial of " + number + " is: " + fact);
 	}

}
