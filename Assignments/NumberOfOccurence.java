package Assignments;

public class NumberOfOccurence {

    // Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.
    static int count(int[] arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                count++;
            }
            if(arr[i] > x){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(count(new int[] {1, 1, 2, 2, 2, 2, 3}, 7, 2));
    }
}
