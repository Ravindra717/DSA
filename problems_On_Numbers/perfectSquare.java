package problems_On_Numbers;

import java.util.Scanner;

public class perfectSquare {
	
	static boolean checkPerfect(int n) {
		for (int i = 0; i*i <= n; i++)
		if(i*i==n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println(checkPerfect(n));
	}

}
