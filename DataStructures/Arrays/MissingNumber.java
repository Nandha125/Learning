package DataStructures.Arrays;

/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. 
Find the missing element.
*/

public class MissingNumber {
	
	public static int findMissingNum(int[] arr, int n,int approach) {
		int missingNum=0;
		if(approach==1) {
			boolean flag=true;
			for(int i=1;i<=n;i++) {
				for(int j=0;j<arr.length;j++) {
					if(i==arr[j]) {
						flag=true;
						break;
					}else {
						flag=false;
					}
				}
				if(!flag) {
					missingNum=i;// Missing numbers added here
				}
			}
		}else{
			n=arr.length;
			//natural numbers summation
			int sum = ((n+1)*(n+2))/2;
			for(int i=0;i<n;i++) {
				sum -= arr[i];
			}
			missingNum=sum;
		}
		return missingNum;
	}
	
	public static void main(String[] args) {
		int missingNum = findMissingNum(new int[] {1,5,3,4,8,9,10,2,7},10,1);
		System.out.print("Missing Numbers: "+ missingNum);
	}

}
