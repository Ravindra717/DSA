package Arrays;

public class largestNum {
	
	public static int largest(int []arr) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {4,2,6,89,54,3,60,0};
		
		System.out.println(largest(arr));

	}

}
