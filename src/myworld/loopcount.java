package myworld;

import java.util.Scanner;

public class loopcount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n");
		int n = sc.nextInt();
		/*
		 * for(int i=1;i<=n;i++) { if(i%2 == 0) { break; } System.out.println(i); }
		 */
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
