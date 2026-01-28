public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 1};
        int n = arr.length;

        // Bubble sort ascending
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find second largest distinct element
        if (n < 2) {
            System.out.println("Second largest: -1");
            return;
        }

        int largest = arr[n - 1];
        int secondLargest = -1;

        // Traverse backward to find distinct second largest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println("Second largest: " + secondLargest);
    }
}
