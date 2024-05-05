package problems_On_Numbers;

import java.util.Scanner;

public class allPalindromeNumbersInAGivenRange {
	
	static void checkP(int n) {
		int y=0;
		int temp=n;
		while(n>0) {
			int x=n%10;
			y=y*10+x;
			n=n/10;
		}
		if(temp==y) {
			System.out.println(y);
		}
	}
	
	static void range(int s,int e) {
		for(int i=s;i<=e;i++) {
			checkP(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int s = scan.nextInt();
		int e = scan.nextInt();
		
		range(s, e);

	}

}
