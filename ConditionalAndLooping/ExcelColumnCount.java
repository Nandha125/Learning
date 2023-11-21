package ConditionalAndLooping;

public class ExcelColumnCount {
	
	public static Integer calExcelCount(String s) {
		Integer column_number=0;
        for(int i=0;i<s.length();i++){
        	column_number *= 26;
        	column_number += s.charAt(i) - 'A' + 1;//subtraction ex. 'D'-'A'= 3
        }
        System.out.println(s+" = "+column_number);
		return column_number;
	}
	
	public static void main(String[] args) {
		calExcelCount("A");
		calExcelCount("AA");
		calExcelCount("ZZ");
		calExcelCount("AAA");
		calExcelCount("ZZZ");
	}

}
