package ConditionalAndLooping;

public class CalcStringNumbers {
	
	public static Integer calStrNums(String s) {
		Integer result=0; Boolean addFlag=false;
		StringBuffer sf = new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(!Character.isAlphabetic(s.charAt(i))) {//only the non alphabetics
				sf.append(s.charAt(i));
				addFlag=true;
				if(i==s.length()-1) {
					result +=Integer.parseInt(sf.toString());//numbers added
				}
			}else {
				if(addFlag) {
					result +=Integer.parseInt(sf.toString());//numbers added
				}
				sf =new StringBuffer();//clear the buffer to split the hole numbers ex. 1esr33f -> 1, 33
				addFlag=false;
			}
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		calStrNums("1abc23");
	}

}
