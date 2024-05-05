package Arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicatesFromUnsorted {
	
	static void remove(int []arr) {
		Set<Integer> set=new LinkedHashSet<>();
		
		for(int i:arr) {
			set.add(i);
		}
		System.out.println(set);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < n; i++) { 
			arr[i]=scan.nextInt();
		}
		
		remove(arr);

	}

}
