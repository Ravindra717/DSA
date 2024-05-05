package problems_On_Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacciSeriesTillNthTerm {
	
	static void fiboSeries(int n) {
		int[]fib=new int[n+1];
		fib[0]=0;
		fib[1]=1;
		
		for (int i = 2; i <= n; i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println(Arrays.toString(fib));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		fiboSeries(n);

	}

}
