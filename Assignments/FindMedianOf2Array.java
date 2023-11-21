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
		int n1 = nums1.length;
		int n2 = nums2.length;
		if(n2< n1){
			return findMedian2(nums2, nums1);
		}
		boolean even = false;
		if((n1+n2)%2 == 0){
			even = true;
		}

		int low = 0;
		int high = n1;
		double median = 0.0;
		while(low <= high){
			int mid1 = (low+high)/2; //0
			int mid2 = (n1+n2+1)/2- mid1;
			int l1 = (mid1 == 0 ? Integer.MIN_VALUE : nums1[mid1-1]);
			int l2 = (mid2 == 0 ? Integer.MIN_VALUE : nums2[mid2-1]);
			int r1 = (mid1 == n1 ? Integer.MAX_VALUE : nums1[mid1]);
			int r2 = (mid2 == n2 ? Integer.MAX_VALUE : nums2[mid2]);
//			System.out.println(l1+ " " + l2 + " " + r1 + " " + r2);
			if(l1 <= r2 && l2 <= r1){
				if(!even){
					median = Math.max(l1,l2);
				}else{
					median = (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
				}
				break;
			}
			if(l1 > r2){
				high = mid1-1;
			}else{
				low = mid1+1;
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
