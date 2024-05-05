package String_problems;

import java.util.Scanner;

public class removeSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		String t="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				continue;
			}else {
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}

}
