package problems_On_Numbers;

import java.util.Scanner;

public class SumOfAPSeries {
	
	static int Ap(int a,int d,int n) {
		int sum=a;
		for(int i=1;i<=n;i++) {
			sum=sum+d;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=scan.nextInt();
		int d=scan.nextInt();
		
		
		System.out.println(Ap(n, a, d));

	}

}
