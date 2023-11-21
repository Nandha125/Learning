package ConditionalAndLooping;

public class ColNameFromColNum {
	
	public static String colName(long n) {
		StringBuilder column_name=new StringBuilder();
		while(n>0) {
			long rem=n%26;
			if(rem==0) {
				column_name.append("Z");
				n=n/26-1;
			}else {
				column_name.append((char)((rem-1)+'A'));
				n=n/26;
			}
		}
		System.out.println(column_name.reverse());
		return column_name.reverse().toString();
	}
	
	public static void main(String[] args) {
		colName(702);
	}

}
