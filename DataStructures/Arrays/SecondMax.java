package DataStructures.Arrays;

public class SecondMax {
	
	public static int findSecondMax(int[] arr) {
		int max = arr[0],s_max=Integer.MIN_VALUE;
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>max) {
				int temp = max;
				max = arr[i];
				s_max = temp;
			}else if(arr[i]>s_max) {
				s_max = arr[i];
			}
		}
		System.out.println(s_max);
		return s_max;
	}
	
	public static void main(String[] args) {
		findSecondMax(new int[] {-3,-1,-9,-6});
	}

}
