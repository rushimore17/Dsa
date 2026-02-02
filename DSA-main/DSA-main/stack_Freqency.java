package Stacaks;

import java.util.Scanner;

public class StringFrequency {
    
    private String input;
    
    StringFrequency(String input) {
        this.input = input;
    }
    
    public void findFrequency() {
        int[] freq = new int[256]; // ASCII size
        
        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            freq[c]++;
        }
        
        // Display frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        
        StringFrequency sf = new StringFrequency(str);
        sf.findFrequency();
        
        scan.close();
    }
}
