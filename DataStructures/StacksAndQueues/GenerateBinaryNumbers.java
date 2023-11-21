package DataStructures.StacksAndQueues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBinaryNumbers {
	
	/*
	 * Given a number N. 
	 * The task is to generate and print all binary numbers with decimal values from 1 to N.
	 * 
	 */
	
	//Function to generate binary numbers from 1 to N using a queue.
	static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
		Queue<String> q = new LinkedList<>();
		q.add("1");
		while(!q.isEmpty()) {
		    String element = q.remove();
		    ans.add(element);
		    if(ans.size() == N) break;
			q.add(element + "0");
			q.add(element + "1");
		}
		return ans;
    }
	
	public static void main(String[] args) {
		generate(5).stream().forEach(e->System.out.print(e+", "));
	}

}
