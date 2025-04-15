package myworld;
import java.util.Scanner;

public class count {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int number = sc.nextInt();
			int power = sc.nextInt();
			int result = 1;
//			int count=0;
//			
//			 while(number>0) { 
//				 number = number%10; count++;
//				 }
//			  System.out.println("count= "+count);
			 
			
		
	//for(int i=number;i!=0;i=i/10) {
//		count++;	
	//}
	//System.out.println("count= "+count);
	//int result = number * number *number;
	//System.out.println(result);
	//int fact = 1;
	//for(int i=1;i<=number;i++) {
//		fact = fact*i;
	//	
	//}
	//System.out.println(fact);
	//int fact = 1;
	//int i=1;
	//while(i<=number) {
//		fact = fact*i;
//		i++;
	//	
	//}
	//System.out.println(fact);
			

//			for(int i = 0; i < power; i++) {
//			    result *= number;
//			}
	//
//			System.out.println("Output of " + number + " is: " +result);
			int i=1;
			while(i <= power) {
			    result *= number;
				i++;
			}
			System.out.println("Output of " + number + " is: " +result);

		}
		

}
