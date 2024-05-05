package Arrays;

import java.util.Scanner;

public class repeatedElements {
	static void repeated(int[]arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}else {
				continue;
			}
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
		
		repeated(arr);
	}

}
