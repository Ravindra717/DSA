package Arrays;


public class sumOfElements {
	
	public static int sum(int[]arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {8,7,1,6,5,9};
		
		System.out.println(sum(arr));
	}

}
