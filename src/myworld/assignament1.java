package myworld;
import java.util.Scanner;


public class assignament1 {
	
	

		public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the value for number:");
		 int number = sc.nextInt();
	     int temp = number;
		 int count = 0;
		 int original = number;
		while(number > 0) {
			number = number/10;
			count++;
		}

		System.out.println("To print the numbers in reverse order");
		for(int i=0;i<count;i++) {
		int digit = temp % 10;
			System.out.println(digit+" ");
			 temp = temp/10;
		} System.out.println();
		
	System.out.println("To print two digits together:");
		temp = original;
	for(int i=0;i<count;i+=2) {
		int digit1 = temp %10;
		temp /=10;		
		int digit2 =0;	
		if(temp >0)
		{
			digit2 = temp%10;
			temp /= 10;
			
		}
		int twodigit = digit2*10 + digit1;
		System.out.print(twodigit + " ");
	    }
	    System.out.println();
	    System.out.println();
	    System.out.println("3) To print Three digits together:");
		temp = original;
		int totaldigits = count;
		while(totaldigits >=3) {
	            int d1 = temp % 10;
	            temp /= 10;
	            int d2 = temp % 10;
	            temp /= 10;
	            int d3 = temp % 10;
	            temp /= 10;
	            int threedigits = d3 * 100 + d2 * 10 + d1;
	            System.out.print(threedigits + " ");
	            totaldigits -= 3;
			
		}    System.out.println();
		 System.out.println();
	     System.out.println("4) Full number:");
	     System.out.println(original);
	}


}
