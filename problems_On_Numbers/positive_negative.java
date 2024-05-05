package problems_On_Numbers;

import java.util.Scanner;

public class positive_negative {
	
	static String check(int n) {
		if(n>=0) {
			return "positive";
		}else {
			return "negative";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println(check(n));

	}

}
