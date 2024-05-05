package problems_On_Numbers;

import java.util.Scanner;

public class maximumAndMinimumDigitInANumber {
	
	static void maxMin(int n) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		while(n>0) {
			int dig=n%10;
			if(dig>max) {
				max=dig;
			}
			if(dig<min) {
				min=dig;
			}
			n=n/10;
		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		maxMin(n);

	}

}
