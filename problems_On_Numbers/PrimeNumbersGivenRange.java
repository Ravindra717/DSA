package problems_On_Numbers;

import java.util.Scanner;

public class PrimeNumbersGivenRange {
	
	static boolean primeChecker(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%2==0) {
				return false;
			}
		}
		return true;
	}
	
	static void range(int n) {
		for (int i = 1; i <= n; i++) {
			boolean primeChecker = primeChecker(i);
			if(primeChecker==true) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		range(n);

	}

}
