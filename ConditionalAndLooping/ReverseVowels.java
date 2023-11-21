package ConditionalAndLooping;

public class ReverseVowels {
	
	public static boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		}
		return false;
	}
	
	public static String swap(String s, int i, int j) {
		char v = s.charAt(i);
		s = s.substring(0, i) + s.charAt(j) + s.substring(i + 1); 
		s = s.substring(0, j) + v + s.substring(j + 1); 
		return s;
	}

    public static String reverseVowels(String s) {
        int i=0,j=s.length()-1,n=s.length();
        while(i<=j) {
        	if(!isVowel(s.charAt(i))) {
        		i++;
        		continue;
        	}
        	if(!isVowel(s.charAt(j))) {
        		j--;
        		continue;
        	}
			if(i == n || j < 0) break;
			if(i > j) break;
			s = swap(s,i,j);
			i++;
			j--;
        }
    	return s;
    }
    
    public static void main(String[] args) {
    	reverseVowels("leetcode");
    }
}
