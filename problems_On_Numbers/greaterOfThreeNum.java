package problems_On_Numbers;

import java.util.Scanner;

public class greaterOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int o=scan.nextInt();
		
		System.out.println(Math.max(m, Math.max(n, o)));

	}

}
