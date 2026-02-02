package Stacaks;

import java.util.Scanner;

public class ReverseStringStack {
    
    private char[] arr;
    private int top;
    private int capacity;
    
    ReverseStringStack(int capacity) {
        this.capacity = capacity;
        arr = new char[capacity];
        top = -1;
    }
    
    public void push(char c) {
        if (top == capacity - 1) {
            System.out.println("Stack is already full");
            return;
        }
        arr[++top] = c;
    }
    
    public char pop() {
        if (top == -1) {
            System.out.println("Stack is already empty");
            return '\0';
        }
        return arr[top--];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scan.nextLine();
        
        ReverseStringStack stk = new ReverseStringStack(input.length());
        
        // push all characters
        for (int i = 0; i < input.length(); i++) {
            stk.push(input.charAt(i));
        }
        
        // pop all characters to reverse
        StringBuilder reversed = new StringBuilder();
        while (!stk.isEmpty()) {
            reversed.append(stk.pop());
        }
        
        System.out.println("Reversed string: " + reversed.toString());
        
        scan.close();
    }
}
