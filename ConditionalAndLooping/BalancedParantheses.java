package ConditionalAndLooping;

import java.util.ArrayList;
import java.util.List;

public class BalancedParantheses {
	
	public static void balancedParantheses(String s) {
		List<String> pList = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			
			
		}
		
	}
	
	public static void main(String[] args) {
		balancedParantheses("[{}()([{}{}{}])]");
	}

}