package problems_On_Numbers;

import java.util.Scanner;

public class evenOrOdd {
	
//	static boolean check(int n) {
//		if(n%2==0) {
//			return true;
//		}
//		return false;
//	}
	
	static boolean check(int n) {
		String s=Integer.toBinaryString(n);
		
		if(s.charAt(s.length()-1)=='0') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println(check(n));

	}

}
