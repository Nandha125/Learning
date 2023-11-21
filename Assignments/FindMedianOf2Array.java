package Assignments;

public class FindMedianOf2Array {
	
	// Approach 1: Brute Force method
	static double findMedian1(int[] nums1, int[] nums2) {
		
		double median = 0.0;
		int m = nums1.length;
		int n = nums2.length;
		int p1 = 0, p2 = 0, index = 0;
		int[] ans = new int[m+n];
		while(index < m+n) {
			if(p1 == m || p2 == n) {
				break;
			}
			if(nums1[p1] == nums2[p2]) {
				ans[index] = nums1[p1];
				p1++;
				index++;
				ans[index] = nums2[p2];
				p2++;
			}else if(nums1[p1] < nums2[p2]) {
				ans[index] = nums1[p1];
				p1++;
			}else {
				ans[index] = nums2[p2];
				p2++;
			}
			index++;
		}
		
		// add remaining elements of nums1
		while(p1<m) {
			ans[index] = nums1[p1];
			index++;
			p1++;
		}
		
		// add remaining elements of nums2
		while(p2<n) {
			ans[index] = nums2[p2];
			index++;
			p2++;
		}
		
		// find median
		int mid = ans.length/2;

		if(ans.length>1 && ans.length%2==0) {
			median = (double)(ans[mid-1]+ans[mid])/2;
		}else {
			median = ans[mid];
		}
		
		return median;
	}
	
	// Approach 2: 
	static double findMedian2(int[] nums1, int[] nums2) {
		
		int m = nums1.length;
		int n = nums2.length;
		
		boolean flag = false;
		double median = 0.0;
		int mid1 = (m-1)/2;
		int mid2 = (n-1)/2;
		int l1 = mid1;
		int r1 = mid1+1;
		int l2 = mid2;
		int r2 = mid2+1;
		
		while(!flag) {
			int min1 = (l1<0)?Integer.MIN_VALUE:nums1[l1]; 
			int max1 = (r1>m-1)?Integer.MAX_VALUE:nums1[r1];
			int min2 = (l2<0)?Integer.MIN_VALUE:nums2[l2]; 
			int max2 = (r2>n-1)?Integer.MAX_VALUE:nums2[r2];

			if(min1 <= max2 && min2 <= max1) {
				if((m+n)%2==0) {
					median = (double)(Math.max(min1,min2)+Math.min(max1,max2))/2;
				}else {
					median = Math.max(min1, min2);
				}
				flag = true;
			}else {
				if(min1 > max2) {
					l1--;
					r1--;
					l2++;
					r2++;
				}
				if(min2 > max2) {
					l1++;
					r1++;
					l2--;
					r2--;
				}
				flag = false;
			}
		}
		return median;
	}
	
	public static void main(String[] args) {
		int[] nums1 = new int[] {1};
		int[] nums2 = new int[] {2};
		System.out.println("#Approach 1 >> Median "+findMedian1(nums1, nums2));
		System.out.println("#Approach 1 >> Median "+findMedian2(nums1, nums2));

	}

}
