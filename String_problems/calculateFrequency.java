package String_problems;

import java.util.Arrays;
import java.util.Scanner;

public class calculateFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		char c[] = s.toCharArray();
	    Arrays.sort(c);

	    int count = 1;
	    for (int i = 0; i < c.length - 1; i++) {
	        if (c[i] == c[i + 1]) {
	            count++;
	        } else {
	            System.out.println(c[i] + ":" + count);
	            count = 1;
	        }
	    }
	    System.out.println(c[c.length - 1] + ":" + count);  
	}
}
