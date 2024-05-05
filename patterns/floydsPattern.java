package patterns;

import java.util.Scanner;

public class floydsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	     int n = scan.nextInt();
	     int count=1;
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<=i;j++) {
	    		 System.out.print(i);
//	    		 count++;
	    	 }
	    	 System.out.println();
	     }

	}

}
