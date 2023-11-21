package Assignments;

public class NonRepeatingElement {

    public static int firstNonRepeating(int arr[], int n)
    {
        // Complete the function
        int i = 0;
        while(i < n){
            boolean repeat = false;
            for(int j = 0; j < n; j++){
                if(i != j && arr[i] == arr[j]){
                    repeat = true;
                    break;
                }
            }
            if(!repeat) {
                break;
            }
            i++;
        }
        return arr[i];
    }

    public static void main(String[] args){
        System.out.println(firstNonRepeating(new int[] {-1, 2, -1, 3, 2}, 5));
    }
}
