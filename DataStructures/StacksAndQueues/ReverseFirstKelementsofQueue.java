package DataStructures.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelementsofQueue {
	
	//https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

    // Function to reverse first k elements of a queue.
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> s = new Stack<Integer>();
        int i = 0;
        while(i<k){
            s.push(q.remove());
            i++;
        }
        i = 0;
        while(!s.empty()){
            q.add(s.pop());       
        }
        i = 0;
        int n = q.size();
        while(i<n-k){
            q.add(q.remove());
            i++;
        }
        return q;
    }
    
    public static void main(String[] args) {
    	Queue<Integer> q = new LinkedList<Integer>();
    	q.add(1);
    	q.add(2);
    	q.add(3);
    	q.add(4);
    	q.add(5);
    	modifyQueue(q, 2).stream().forEach(e->System.out.print(e+", "));
    }
}
