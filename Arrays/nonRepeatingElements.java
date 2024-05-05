package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class nonRepeatingElements {
	
	static void nonRepeating(int[]nums) {
     Arrays.sort(nums);
	    
	         if(nums[0] != nums[1]) 
	        	 System.out.print(nums[0]+" ");
	    
	         for(int i=1;i<nums.length-1;i++) {
	             if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1])
	                 System.out.print(nums[i]+" ");
	         }
	            
              if(nums[nums.length-2] != nums[nums.length-1]) 
            	  System.out.print(nums[nums.length-1]);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < n; i++) { 
			arr[i]=scan.nextInt();
		}
		
		nonRepeating(arr);
	}

}
