package problems_On_Numbers;

import java.util.Scanner;

public class checkPrimeNum {
	
	static boolean primeChecker(int num) {
		if (num == 1)
		    return false;
		  int i ;
		  for (i = 2; i < num/2; i++)
		  {
		    if (num % i == 0)
		      return false;
		  }
		  return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(primeChecker(n));

	}

}
