package ConditionalAndLooping;

public class CamelCastCount {
	
	public static Integer camelCaseCount(String str) {
		Integer ccc=0;
		if(str.length()>0) {
			for(int i=0;i<str.length();i++) {
				if(!Character.isLowerCase(str.charAt(i))){
					ccc++;
				}
			}
		}
		System.out.println(ccc);
		return ccc;
	}
	
	public static void main(String[] args) {
		camelCaseCount("sdaEEdfsdfEFEDf");
	}

}
