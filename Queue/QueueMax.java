package Queue;

import java.util.*;

public class QueueMax {
    int que[] = new int[50];
    int size, front, rear, max;

    QueueMax(int cap) {
        size = cap;
        rear = 0;
        front = 0;
    }

    void add_ele(int n) {
        if (rear == size) {
            System.out.println("QUEUE OVERFLOW!");
        } else {
            if (rear == 0 && front == 0) {
                front = 1;
                rear = 1;
            } else {
                rear += 1;
            }
            que[rear] = n;
        }
    }

    void getMax() {
        if (front == 0 && rear == 0) {
            System.out.println("QUEUE EMPTY!");
        } else {
            max = que[front];
            System.out.print("Largest element: ");
            for (int i = front; i <= rear; i++) {
                if (que[i] > max) {
                    max = que[i];
                }
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int cap = sc.nextInt();
        QueueMax ob = new QueueMax(cap);

        int ch;

        do {
            System.out.println("\n1. Add element\n2. Get the largest element\n3. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter an integer: ");
                    int val = sc.nextInt();
                    ob.add_ele(val);
                    break;

                case 2:
                    ob.getMax();
                    break;

                case 3:
                    System.out.println("Terminating program...\nProgram terminated");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (ch != 3);
        sc.close();
    }
}
