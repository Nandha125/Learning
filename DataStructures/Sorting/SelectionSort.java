package DataStructures.Sorting;

public class SelectionSort  extends Sorting{
	
	@Override
	public int[] sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min_idx=i;// minimum index
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_idx]) {// comparison of values
					min_idx=j; // change the minimum index
				}
			}
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int v = arr[i];
        int index = i;
        for(int j = i+1; j< arr.length; j++){
            if( v > arr[j]){
                v = arr [j];
                index = j;
            }
        }
        return index;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i<n; i++){
	        int index = select(arr, i);
	        int temp = arr[i];
	        arr[i] = arr[index];
	        arr[index] = temp;
	    }
	    
	}

}
