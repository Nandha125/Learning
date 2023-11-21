package DataStructures.Sorting;

public class MergeSort {


    // @todo merge logic needs to be done

    static void merge(int[] arr, int l, int mid,  int r){
        while(l < r){
            if(arr[mid] > arr[r]){
                int temp = arr[mid];
                arr[mid] = arr[r];
                arr[r] = temp;
            }
        }
    }

    static void mergeSort(int[] arr, int l, int r){
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            System.out.println(arr[l]+"---"+mid+"---"+arr[r]);
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args){
        int[] arr = new int[] {5,6,2,1,0,3,4};
        int n = arr.length-1;
        mergeSort(arr, 0, n);
        for(int i =0; i<=n; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
