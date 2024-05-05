package Arrays;

import java.util.Scanner;

public class removeDuplicatesfromSorted {
	
	static void removeD(int []arr) {
		int i=0,j=i+1;
		
		while(j<arr.length) {
			if(arr[i]==arr[j]) {
				j++;
			}else {
				i++;
				arr[i]=arr[j];
				j++;
			}
		}
		for(int k=0;k<=i;k++) {
			System.out.println(arr[k]);
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
		
		removeD(arr);

	}

}
