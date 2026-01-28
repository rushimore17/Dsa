package Array_question;
import java.util.*;
public class Second_largest {


	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        if (n < 2) {
	            System.out.println(-1);
	            return;
	        }

	        Arrays.sort(arr); // ascending
	        int largest = arr[n - 1];
	        
	        // Find second largest distinct
	        for (int i = n - 2; i >= 0; i--) {
	            if (arr[i] < largest) {
	                System.out.println(arr[i]);
	                return;
	            }
	        }
	        System.out.println(-1);
	    
	}
}
