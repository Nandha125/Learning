package CodeDaily;

public class ReverseArray {
	
	public static void main(String[] args) {
		int [] arr = new int[] {2,10,4,5,15};
		int i=0,j=arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}		
		for(int k=0; k< arr.length; k++) {
			System.out.print(arr[k]+", ");
		}
	}

}
