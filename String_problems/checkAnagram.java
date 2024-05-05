package String_problems;

import java.util.Arrays;
import java.util.Scanner;

public class checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String s1=scan.nextLine();
		
		char c[]=s.toCharArray();
		Arrays.sort(c);
		char c1[]=s1.toCharArray();
		Arrays.sort(c1);
		
		boolean arraysAreEqual = true;

		if (c.length != c1.length) {
		    arraysAreEqual = false;
		} else {
		    for (int i = 0; i < c1.length; i++) {
		        if (c[i] != c1[i]) {
		            arraysAreEqual = false;
		            break;
		        }
		    }
		}

		if (arraysAreEqual) {
		    System.out.println("true");
		} else {
		    System.out.println("false");
		}
	}

}
