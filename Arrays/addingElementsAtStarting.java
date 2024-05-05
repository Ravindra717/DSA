package Arrays;

import java.util.Arrays;

public class addingElementsAtStarting {
	
	static void insertatbegin(int[] arr,int n,int value)
	{
	    for(int i=n-1;i>=0;i--)
	    {
	        arr[i+1]=arr[i];
	    }
	    arr[0]=value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
	    int arr[]={10,9,14,8,20,48,16,9,0};
	    int value=40;
	    System.out.println("Before inserting the value at beginning:");
	     for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
		System.out.println();  
		
		insertatbegin(arr, n, value);
		
		System.out.println("After inserting the value:");
		
		System.out.println(Arrays.toString(arr));
	}

}
