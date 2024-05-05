package Arrays;

public class smallestNum {
	
	public static int smallNum(int []arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {4,2,6,89,54,3,60,0};
		
		System.out.println(smallNum(arr));

	}

}
