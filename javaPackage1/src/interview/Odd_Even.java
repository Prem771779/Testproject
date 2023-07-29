package interview;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
	
		int  a[] = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Odd value");
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				
				System.out.println(a[i]);
				
			}
			
		}
		
		System.out.println("Enter the Even value");
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		}

		
	}

}
