package Assignments;

public class ValidPalindrome2 {
    //Given a string s, return true if the s can be palindrome after deleting at most one character from it.

    static int[] checkPalindrom(String s){
        int i = 0 ;
        int j = s.length()-1;
        while( i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return new int[]{i,j};
            }
            i++;
            j--;
        }
        return new int[]{-1};
    }
    public static boolean validPalindrome(String s) {
        int [] arr = checkPalindrom(s);
        if(arr.length == 1){
            return true;
        }else{
            String newStr1 = s.substring(0,arr[0])+s.substring(arr[0]+1);
            String newStr2 = s.substring(0,arr[1])+s.substring(arr[1]+1);
            int [] newArr1 = checkPalindrom(newStr1);
            int [] newArr2 = checkPalindrom(newStr2);
            if(newArr1.length == 1 || newArr2.length == 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(validPalindrome("ada"));
    }

}
