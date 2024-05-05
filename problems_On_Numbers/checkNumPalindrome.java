package problems_On_Numbers;

import java.util.Scanner;

public class checkNumPalindrome {
	
	static int checkPalindrome(int X) {
		int Y = 0;
	      while (X > 0) {
	         //Extract the last digit
	         int digit = X % 10;
	         //Appending last digit
	         Y = Y * 10 + digit;
	         // Shrinking X by discarding the last digit
	         X = X / 10;
	      }
	      return Y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int X = scan.nextInt();
		
		int z=checkPalindrome(X);
		System.out.println(X==z);

	}

}
