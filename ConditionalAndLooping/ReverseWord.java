package ConditionalAndLooping;

public class ReverseWord {
	
    public static String reverseWords(String s) {
    	String reversedStr="";
    	int i=s.length()-1;
    	
    	
    	int j=i;
    	boolean space = false;
//    	System.out.println(s);
		while(i>=0 && j>=0) {
			if(s.charAt(j) != ' ') {
//				System.out.println(" "+s.charAt(j));
				j--;
				space = true;
			}else {
//		        System.out.println("( "+(j+1)+" , "+(i+1)+" ) ");
//				System.out.println("word>>>>>>"+s.substring(j+1,i+1));
				reversedStr += s.substring(j+1,i+1);
				if(space) reversedStr += " "; space = false;
				i = j-1;
				j = i;
			}
			if(j==0 && s.charAt(j) != ' ') {
				reversedStr += s.substring(0,i+1);
			}
		}
        System.out.println("---"+reversedStr+"---");
    	return reversedStr;
    }

	
    public static void main(String[] args) {
//    	reverseWords("the sky is blue");
    	reverseWords("  hello world  ");
//    	reverseWords("a good   example");
//    	reverseWords("t  y i e");
    }
}
