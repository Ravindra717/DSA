package String_problems;

import java.util.Scanner;

public class removeVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		String t="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
				continue;
			}else {
				t=t+ch;
			}
		}
		System.out.println(t);

	}

}
