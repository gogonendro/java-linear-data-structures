package Queue;

import java.util.*;

public class QueueSum {
    int que[] = new int[50];
    int size, front, rear, sum_ele = 0;

    QueueSum(int cap) {
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

    void sum() {
        sum_ele = 0;
        if (front == 0 && rear == 0) {
            System.out.println("QUEUE EMPTY!");
        } else {
            System.out.print("Sum of the elements in queue: ");
            for (int i = front; i <= rear; i++) {
                sum_ele += que[i];
            }
            System.out.println(sum_ele);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int cap = sc.nextInt();
        QueueSum ob = new QueueSum(cap);

        int ch;

        do {
            System.out.println("\n1. Add element\n2. Get sum\n3. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter an integer: ");
                    int val = sc.nextInt();
                    ob.add_ele(val);
                    break;

                case 2:
                    ob.sum();
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
