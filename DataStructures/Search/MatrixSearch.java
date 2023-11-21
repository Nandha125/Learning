package DataStructures.Search;

public class MatrixSearch {
	
    static int findTargetRow(int[][] matrix, int target){
        int l = 0;
        int r = matrix.length-1;
        int row = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(matrix[mid][0]<=target){
                row = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return row;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
//        int row = findTargetRow(matrix, target);
//        int l = 0;
//        int r = matrix[0].length-1;
//        while(l <= r){
//            int mid = (l+r)/2;
//            if(matrix[row][mid] == target){
//                return true;
//            }else if(matrix[row][mid]>target){
//                r = mid-1;
//            }else{
//                l = mid+1;
//            }
//        }
//        return false;
        
        
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = (m*n)-1;
        while( l <= r){
            int mid = (l+r)/2;
            //identify the row number and column number 
            int element = matrix[mid/n][mid%n];
            if(element == target) return true;
            if(element > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {

    }

}
