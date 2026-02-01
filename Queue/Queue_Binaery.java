class StringQueue {
    private int front, rear, size, capacity;
    private String[] arr;

    // Constructor
    StringQueue(int capacity) {
        this.capacity = capacity;
        arr = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void enqueue(String x) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    // Dequeue
    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return null;
        }
        String item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
}

public class BinaryNumbersQueue {
    public static void generateBinary(int n) {
        // Queue capacity should be large enough (2*n is safe)
        StringQueue q = new StringQueue(2 * n);

        // Start with "1"
        q.enqueue("1");

        for (int i = 1; i <= n; i++) {
            // Get front of queue
            String s = q.dequeue();

            // Print it
            System.out.print(s + " ");

            // Enqueue next two numbers
            q.enqueue(s + "0");
            q.enqueue(s + "1");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        generateBinary(N);
    }
}
