package problems_On_Numbers;

import java.util.Scanner;

public class factorial {
	
//	static int fact(int n) {
//		int sum=1;
//		for (int i = 1; i <= n; i++) {
//			sum=sum*i;
//		}
//		return sum;
//	}
	
	static int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println(fact(n));

	}

}
