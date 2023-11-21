package DataStructures.Sorting;

public class MainClass {
	
	public static void PrintArray(String algorithm,int[] arr) {
		System.out.println(algorithm+" ");
		for(int e:arr) {System.out.print(e+", ");}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,6,2,1,0,3,4};
		SelectionSort selection = new SelectionSort();
		PrintArray("SelectionSort", selection.sort(arr));
		BubbleSort bubble = new BubbleSort();
		PrintArray("BubbleSort", bubble.sort(arr));
	}

}
