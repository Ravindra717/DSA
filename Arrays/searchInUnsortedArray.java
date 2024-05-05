package Arrays;

import java.util.Scanner;

public class searchInUnsortedArray {
	
	static int search(int[]arr,int k) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < n; i++) { 
			arr[i]=scan.nextInt();
		}
		
		System.out.println(search(arr, 0));

	}

}
