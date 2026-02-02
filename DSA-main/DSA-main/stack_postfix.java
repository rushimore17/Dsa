package Stacaks;

import java.util.Scanner;
class IntStack { 
	int[] arr;
	int top; 
	int capacity; 
	
	IntStack(int size) { 
		arr = new int[size];
		capacity = size; top = -1; 
		} 
	
	void push(int x) {
		
		arr[++top] = x; 
		} 
	
	int pop() { 
		
		return arr[top--]; 
		
		} 
	
	boolean isEmpty() {
		
		
		return top == -1; 
		
	} 
	
	}

public class postfix_exparession {
	public static void main(String[] args) { 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter postfix expression:"); 
		
		String[] tokens = sc.nextLine().split(" "); 
		
		IntStack stack = new IntStack(tokens.length);
		
		for (String token : tokens) 
		{
			
			if (token.equals("+")) { 
			int b = stack.pop(); 
			
			int a = stack.pop();
			
			stack.push(a + b); 
			
			} 
			else if (token.equals("-")) {
				int b = stack.pop();
				int a = stack.pop(); 
				stack.push(a - b); 
				} else if (token.equals("*")) {
					int b = stack.pop(); int a = stack.pop();
					stack.push(a * b);
					
				} else if (token.equals("/")) 
				{ int b = stack.pop();
				int a = stack.pop();
				stack.push(a / b);
				}
				else { stack.push(Integer.parseInt(token)); 


				} 
		} 
		
		System.out.println("Result: " + stack.pop()); 
		sc.close();
	}

	
}
