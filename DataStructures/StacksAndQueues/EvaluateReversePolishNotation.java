package DataStructures.StacksAndQueues;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        int result = 0;
        for(int i=0; i<tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") 
                && !tokens[i].equals("*") && !tokens[i].equals("/")){
                s.push(Integer.valueOf(tokens[i]));
            }else {
                int b = s.peek();
                s.pop();
                int a = s.peek();
                s.pop();
                if(tokens[i].equals("+")){
                	result = a+b;
                }else if(tokens[i].equals("-")){
                	result = a-b;
                }else if(tokens[i].equals("*")){
                	result = a*b;
                }else if(tokens[i].equals("/")){
                	result = (a/b);
                }
                s.push((Integer)result);
            }
        }
        return s.peek();
    }
    
    public static void main(String[] args) {
    	System.out.println(evalRPN(new String[] {"2","1","+","3","*"}));
    }
	
}
