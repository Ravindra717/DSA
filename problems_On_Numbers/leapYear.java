package problems_On_Numbers;

import java.util.Scanner;

public class leapYear {
	
	static boolean leapYr(int yr) {
		if(yr%400==0) {
			return true;
		}
		if(yr%100==0) {
			return false;
		}
		if(yr%4==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int yr=scan.nextInt();
		
		System.out.println(leapYr(yr));

	}

}
