package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class median {
	
	static double mid(int[]arr,int n) {
		Arrays.sort(arr);
		if(n%2==0) {
			int n1=(n/2)-1;
			int n2=n/2;
			return (n1+n2)/2;
		}else {
			return n/2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < n; i++) { 
			arr[i]=scan.nextInt();
		}
		
		System.out.println(mid(arr, n));
	}
 

}
