package CodeDaily;

public class FirstLastSame {
	
	static boolean isSame(int[] arr) {
		if(arr.length>0 && arr[0] == arr[arr.length-1]) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isSame(new int[] {}));
	}

}
