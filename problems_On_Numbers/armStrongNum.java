package problems_On_Numbers;

import java.util.Scanner;

public class armStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
	    int z = n;
	    int count = 0;
	    //counting the numbers
	    while(z > 0) {
	        count++;
	        z = z / 10;
	    }
	    //reset the z value to n
	    z = n;
	    int sum = 0;
	    
	    //remove last digit
	    while(z > 0) {
	        int digit = z % 10;
	        int product = 1;
	        
	        //calculate the num with power 
	        for (int i = 1; i <= count; i++) {
	            product = product * digit;
	        }
	        //add the all product 
	        sum = sum + product;
	        z = z / 10;
	    }
	    System.out.println(sum == n);

	}

}
