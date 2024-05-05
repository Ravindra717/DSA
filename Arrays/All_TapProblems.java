import java.util.Arrays;

public class TapProblems {
	
	static int binarySearch(int[]arr,int key) {
		int low=0,high=arr.length-1,mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}
	
	static int spanOfAnArray(int[]arr) {
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}if(min>arr[i]) {
				min=arr[i];
			}
		}
		return max-min;
	}
	
	static int secondLargest(int[]arr) {
		int max1,max2;
		if(arr[0]<arr[1]) {
			max1=arr[1];
			max2=arr[0];
		}else {
			max1=arr[0];
			max2=arr[1];
		}
		for(int i=2;i<arr.length;i++) {
			if(max1<arr[i]) {
				max2=max1;
				max1=arr[i];
			}
			else if(max2<arr[i]) {
				max2=arr[i];
			}
		}
		return max2;
	}
	
	static  int ceil(int[]arr,int key) {
		int low=0,high=arr.length-1,mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				return arr[mid];
			}else if(key<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return arr[low];
	}
	
	static int floor(int[]arr,int key) {
		int low=0,high=arr.length-1,mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				return arr[mid];
			}else if(key<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return arr[high];
	}
	
//	static int bitonicArraySearch(int[]arr) {
//		 
//	}
	
	static int countTheElements(int[]arr,int key) {
		int low=0,high=arr.length-1,mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				while(mid+1<arr.length &&  key==arr[mid+1]) {
					mid++;
				}
				return mid+1;
			}else if(key<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return high+1;
	}
	
	public static int missingNum(int[] nums) {
	    int sum = 0, sum1 = 0;
	    for(int i = 0; i < nums.length; i++){
	        sum = sum + i;
	        sum1 = sum1 + nums[i];
	    }
	    sum = sum + nums.length;
	    return sum - sum1;
	}
	
	static int maximumGap(int[]arr) {
		int sum=0;
		int maxSum=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			sum=arr[i+1]-arr[i];
			if(maxSum<sum) {
				maxSum=sum;
			}
		}
		return maxSum;
	}

	static double median(int[] arr, int[] arr1) {
	    int[] res = new int[arr.length + arr1.length];
	    int i = 0, j = 0, k = 0;
	    while (i < arr.length && j < arr1.length) {
	        if (arr[i] < arr1[j]) {
	            res[k] = arr[i];
	            i++;
	        } else {
	            res[k] = arr1[j];
	            j++;
	        }
	        k++;
	    }
	    while (i < arr.length) {
	        res[k] = arr[i];
	        i++;
	        k++;
	    }
	    while (j < arr1.length) {
	        res[k] = arr1[j];
	        j++;
	        k++;
	    }
	    int n = res.length;
	    if (n % 2 == 1) {
	        return (double) (res[n / 2] + res[n / 2 - 1]) / 2;
	    }
	    return res[n / 2];
	}
	
	static int removeDuplicates(int[]arr) {
		int i=0,j=i+1;
		while(i<arr.length-1 && j<arr.length) {
			if(arr[i]==arr[j]) {
				j++;
			}else {
				i++;
				arr[i]=arr[j];
				j++;
			}
		}
//		i++;
//		while(i<arr.length) {
////			i++;
//			arr[i]=0;
//			i++;
//		}
		return i;
	}
	
	static void rotateArray(int[] arr, int start,int end) {
	    while(start<end) {
	    	int temp=arr[start];
	    	arr[start]=arr[end];
	    	arr[end]=temp;
	    	start++;
	    	end--;
	    }
	}
	static void rotate(int[]arr,int k) {
		k=k%arr.length;
		if(k<0) {
			k=k+arr.length;
		}
		rotateArray(arr, 0, k-1);
		rotateArray(arr, k, arr.length-1);
		rotateArray(arr, 0, arr.length-1);
	}
	
	static void moveZeros(int[]arr) {
		int i=0,j=i;
		while(i<arr.length) {
			if(arr[i]==0) {
				i++;
			}else {
				arr[j]=arr[i];
				i++;j++;
			}
		}
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
	}
	
	static void moveMinusOne(int[]arr) {
		int i=arr.length-1,j=i;
		while(i>=0) {
			if(arr[i]==-1) {
				i--;
			}else {
				arr[j]=arr[i];
				i--;j--;
			}
		}
		while(j>=0) {
			arr[j]=-1;
			j--;
		}
	}
	
	static void subArray(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	static void leader(int[] arr) {
	    for(int i = 0; i < arr.length; i++) {
	        int j;
	        for(j = i + 1; j < arr.length; j++) {
	            if(arr[i] <= arr[j]) {
	                break;
	            }
	        }
	        if(j == arr.length) { // If loop didn't break
	            System.out.println(arr[i]);
	        }
	    }
	}
	
	static void frequency(int[]arr) {
		
	}

	static void avg(int[]nums,int k) {
		int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=k){
                sum=sum+(nums[i]);
                count++;
            }
        }
         System.out.println(sum);
        double avg=sum/k;
//        return avg;
        System.out.println(avg);
	}
	
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
            	int product=1;
                for(int x=i;x<=j;x++){
                    product=product*nums[x];
//                    System.out.print(nums[x]+" ");
                }
                System.out.println(product);
                if(product<k){
                    count++;
                }
            }
        }
        System.out.println();
        return count;
    }


	public static void main(String[] args) {
//		int []arr= {3,5,6,8,12,15,16,19,21};
		int key=12;
//		int[]arr= {20,42,6,25,30,38};
//		int []arr= {2,6,12,18,18,26,26,42};
//		int[]arr= {3,0,1};
//		int[]arr= {3,6,9};
//		int[]arr1= {2};
//		int[]arr= {2,2,3,3,4,6,6};	
//		int[]arr= {10,20,30,40,50,60,70,80,90};
		int[]arr= {0,10,22,8,0,5,0};
//		int[]arr= {5,-1,3,-1,4,5,3,-1,8,2};
//		int arr[]= {1,2,3,4,5};
//		int[]arr= {8,11,5,11,7,6,3};
//		int []nums= {1,12,-5,-6,50,3};
//		int []nums={10,5,2,6};
		
//		System.out.println(binarySearch(arr, key));
//		System.out.println(spanOfAnArray(arr));
//		System.out.println(secondLargest(arr));
//		System.out.println(ceil(arr, 4));
//		System.out.println(floor(arr,20));
//		System.out.println(countTheElements(arr, 42));
//		System.out.println(missingNum(arr));
//		System.out.println(maximumGap(arr));
//		System.out.println(median(arr, arr1));
//		int k=removeDuplicates(arr);
//		rotate(arr, 4);
//		moveZeros(arr);
//		moveMinusOne(arr);
		subArray(arr);
//		leader(arr);
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
//		
//		avg(nums, 4);
//		System.out.println(numSubarrayProductLessThanK(nums, 100));
	}
	

}
