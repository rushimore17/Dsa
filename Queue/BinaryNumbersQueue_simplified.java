package Queue;

import java.util.Scanner;

public class BinaryNumbersQueue {
    private int front, rear, size;
    private String[] arr;
    private int capacity;

    // Constructor
    BinaryNumbersQueue(int capacity) {
        this.capacity = capacity;
        arr = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void enqueue(String x) {
        if (size == capacity) {
            System.out.println("Queue is already full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    // Dequeue
    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue is already empty");
            return null;
        }
        String item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Generate binary numbers from 1 to n
    public void generateBinary(int n) {
        enqueue("1"); // start with "1"

        for (int i = 1; i <= n; i++) {
            String s = dequeue();
            System.out.print(s + " ");
            enqueue(s + "0");
            enqueue(s + "1");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N (limit of binary numbers): ");
        int n = scan.nextInt();

        // capacity should be at least 2*n for safety
        BinaryNumbersQueue q = new BinaryNumbersQueue(2 * n);

        System.out.println("Binary numbers from 1 to " + n + " are:");
        q.generateBinary(n);
    }
}
