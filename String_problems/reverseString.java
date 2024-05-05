package String_problems;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		String t="";
		for (int i = s.length()-1; i >=0; i--) {
			t=t+s.charAt(i);
		}
		System.out.println(t);
	}

}
