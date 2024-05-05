package patterns;

import java.util.Scanner;

public class downLefttSideRightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
