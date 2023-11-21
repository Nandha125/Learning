package DataStructures.Search;

public class FindOccurence {
	
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
		System.out.print(count(new int[] {1, 1, 2, 2, 2, 2, 3},7,2));
	}

}
