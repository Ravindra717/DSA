package problems_On_Numbers;

import java.util.Scanner;

public class sumOfNaturalNum {
	
//	static int sum(int n) {
//		int sum=0;
//		for (int i = 1; i <= n; i++) {
//			sum=sum+i;
//		}
//		return sum;
//	}
	
	static int sum(int n) {
		return n*(n+1)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println(sum(n));

	}

}
