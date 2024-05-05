package Arrays;

import java.util.Scanner;

public class average {
	public static int avg(int[]arr,int n) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		int avg=sum/n;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < n; i++) { 
			arr[i]=scan.nextInt();
		}
		
		System.out.println(avg(arr,n));

	}

}
