package Assignments;

public class Merge2SortedArray {

    /*
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    */

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while(i < m && j< n){
            int val = nums2[j];
            if(nums1[i] <= nums2[j]){
                i++;
            }else{
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                j++;
            }
        }
        for(int k=0; k<n; k++){
            System.out.println(nums2[k]);
        }
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{2,8,9,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{1,2,5};
        int n = 3;
        merge(nums1, m, nums2, n);
        for(int i =0; i<m+n; i++){
            System.out.print(nums1[i]+", ");
        }
    }
}
