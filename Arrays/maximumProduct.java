package Arrays;

import java.util.Scanner;

public class maximumProduct {
	
	static int max(int[]arr) {
		int maxProduct=0;
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				int max=1;
				for(int k=i;k<=j;k++) {
					max=max*arr[k]; 
				}
				if(max>maxProduct) {
					maxProduct=max;
				}
			}
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < n; i++) { 
			arr[i]=scan.nextInt();
		}
		
		System.out.println(max(arr));

	}

}
