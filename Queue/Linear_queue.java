package Queue;

import java.util.Scanner;

public class LinearQueue {
    private int front, rear, size;
    private int[] arr;
    private int capacity;

    // Constructor
    LinearQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue (insert at rear)
    public void enqueue(int x) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow (rear reached end)");
            return;
        }
        rear++;
        arr[rear] = x;
        size++;
    }

    // Dequeue (remove from front)
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow (empty)");
            return -1;
        }
        int item = arr[front];
        front++;
        size--;
        return item;
    }

    // Peek (front element)
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Display elements
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Elements in queue are:");
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter queue size:");
        int n = scan.nextInt();

        LinearQueue q = new LinearQueue(n);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued element: " + q.dequeue());
        q.display();

        System.out.println("Peek element: " + q.peek());
    }
}
