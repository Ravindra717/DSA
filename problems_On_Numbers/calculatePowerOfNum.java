package problems_On_Numbers;

import java.util.Scanner;

public class calculatePowerOfNum {
	
	static int pow(int n,int p) {
		int product=1;
		for (int i = 0; i < p; i++) {
		      product = product * n;
		    }
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int p=scan.nextInt();
		
		System.out.println(pow(n, p));

	}

}
