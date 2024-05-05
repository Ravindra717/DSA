package String_problems;

import java.util.Scanner;

public class sumOfNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		String tempSum = "";
	    int sum = 0;
	    for (int i = 0; i < s.length(); i++) {
	        char ch = s.charAt(i);

	        if (Character.isDigit(ch))
	            tempSum += ch;
	        else {
	            sum += Integer.parseInt(tempSum);
	            tempSum = "0";
	        }
	    }
	    System.out.println(sum + Integer.parseInt(tempSum));
	}

}
