package myworld;
import java.util.Scanner;


public class powerofNumber {

	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number");
			int number = sc.nextInt();
			System.out.println("Enter the power for the number");
			int power = sc.nextInt();
	        int res = 1;
	        for(int i=1;i<=power;i++) {
	        	res *= number;
	        }
	        System.out.println("Output of the operation is :"+res);
			
		}

}
