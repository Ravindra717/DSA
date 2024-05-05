package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rotateElementsByK {
	
	static void rotate(int[]arr) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}
	
	static void rotateByK(int[]arr,int k) {
		for (int i = 1; i <=k; i++) {
			rotate(arr);
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
		
		rotateByK(arr, 2);
		System.out.println(Arrays.toString(arr));

	}

}
