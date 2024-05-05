package problems_On_Numbers;

import java.util.Scanner;

public class reverseDigits {
	
	static int reverse(int n) {
		int y=0;
		while(n>0) {
			int digit=n%10;
			y=y*10+digit;
			n=n/10;
		}
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println(reverse(n));
	}

}
