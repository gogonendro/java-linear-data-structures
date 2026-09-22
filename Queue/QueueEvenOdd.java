package Queue;

import java.util.Scanner;

public class QueueEvenOdd {
    int que[] = new int[50];
    int size, front, rear;

    QueueEvenOdd(int cap) {
        if (cap > 0 && cap <= 50) {
            size = cap;
        } else {
            System.out.println("Invalid size. Default size 50 selected");
            size = 50;
        }
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

    void count() {
        if (front == -1 && rear == -1) {
            System.out.println("QUEUE EMPTY!");
        } else {
            int even = 0;
            int odd = 0;

            for (int i = front; i <= rear; i++) {
                if (que[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println("Number of even elements: " + even);
            System.out.println("Number of odd elements: " + odd);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int cap = sc.nextInt();
        QueueEvenOdd ob = new QueueEvenOdd(cap);

        int ch;

        do {
            System.out.println("\n1. Add element\n2. Get the even odd count\n3. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter an integer: ");
                    int val = sc.nextInt();
                    ob.add_ele(val);
                    break;

                case 2:
                    ob.count();
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
