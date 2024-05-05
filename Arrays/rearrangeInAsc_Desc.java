package Arrays;

import java.util.Arrays;

public class rearrangeInAsc_Desc {
	
	public static void rearrange(int[]arr) {
		Arrays.sort(arr);
		int []nums=new int[arr.length];
		int j=0;
		for (int i = 0; i < nums.length/2; i++) {
			nums[j]=arr[i];
			j++;
		}
		for (int i = arr.length-1; i >=nums.length/2; i--) {
			nums[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {8,7,1,6,5,9};
		
		rearrange(arr);

	}

}
