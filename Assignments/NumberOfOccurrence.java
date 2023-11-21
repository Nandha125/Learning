package Assignments;

public class NumberOfOccurrence {
    static int count(int[] arr, int n, int x) {
        // code here
        int l = 0, r = n-1, count = 0;
        while(l <= r){
            if(l == r && (arr[l] == x && arr[r] == x)){
                count++;
            }else{
                if(arr[l] == x){
                    count++;
                }
                if(arr[r] == x){
                    count++;
                }
            }
            l++;
            r--;
        }
        return count;
    }
    
    public static void main(String[] args) {
    	System.out.println(count(new int[] {1,2,3},3,1));
    }

}
