package Array_question;

import java.util.Scanner;

public class Array_Print {

	public static void main(String[] arg) {

		System.out.println("this is simple array program: ");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of array");

		int n = scan.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the array elements to insert ");

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("arrays to print :");

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("mininun value is : " + min);

		System.out.println("maximum value is : " + max);

		System.out.println("Enter the element position  want to change: ");

		int x = scan.nextInt();

		if (n > x) {
			System.out.println("enter the value want to enter");
			arr[x] = scan.nextInt();
		} else {
			System.out.println("array size is not that much");

		}

		System.out.println(arr[x]);

		System.out.println("new array after the position is changed");

		for (int i = 0; i < n; i++) {

			System.out.println(arr[i] + "  ");
		}

	}

}
