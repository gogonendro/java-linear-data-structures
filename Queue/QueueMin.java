package Queue;

import java.util.*;

public class QueueMin {
    int que[] = new int[50];
    int size, front, rear;

    QueueMin(int cap) {
        // in-case user enters an invalid capacity
        if (cap > 0 && cap <= 50) {
            size = cap;
        } else {
            System.out.println("Invalid size. Default size 50 selected");
            size = 50;
        }
        // using general convention of -1 as empty
        rear = -1;
        front = -1;
    }

    void add_ele(int n) {
        if (rear == size - 1) {
            System.out.println("QUEUE OVERFLOW!");
        } else {
            if (rear == -1 && front == -1) {
                front = 0;
                rear = 0;
            } else {
                rear += 1;
            }
            que[rear] = n;
        }
    }

    void getMax() {
        if (front == -1 && rear == -1) {
            System.out.println("QUEUE EMPTY!");
        } else {
            int min = que[front];
            System.out.print("Smallest element: ");
            for (int i = front; i <= rear; i++) {
                if (que[i] < min) {
                    min = que[i];
                }
            }
            System.out.println(min);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int cap = sc.nextInt();
        QueueMin ob = new QueueMin(cap);

        int ch;

        do {
            System.out.println("\n1. Add element\n2. Get the smallest element\n3. Exit");
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
