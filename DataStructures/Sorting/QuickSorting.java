package DataStructures.Sorting;

public class QuickSorting {
	
	static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int pos = partition(arr, low, high);
            quickSort(arr, low, pos-1);
            quickSort(arr, pos+1, high);
        }

    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[high];
        int j = low-1;
        for(int i=low; i<high; i++){
            if(arr[i]<pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        j++;
        int temp = arr[j];
        arr[j] = pivot;
        arr[high] = temp;
        return j;
    } 
    
    public static void main(String[] args) {
    	quickSort(new int[] {4, 1, 3, 9, 7}, 0, 4);
    }

}
