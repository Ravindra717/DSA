package String_problems;

import java.util.Scanner;

public class countVowelsCosonantsAndSpaces {
	
	static void count(String s) {
		int vowels=0;
		int con=0;
		int spaces=0;
		 for (int i = 0; i < s.length(); i++) {
		        char ch = s.charAt(i);
		        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
		            vowels++;
		        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
		            con++;
		        } else if (ch == ' ') {
		            spaces++;
		        }
		    }
		System.out.println("vowels:"+vowels);
		System.out.println("con:"+con);
		System.out.println("spaces:"+spaces);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		count(s);
	}

}
