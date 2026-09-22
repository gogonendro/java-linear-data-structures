package Queue;

import java.util.*;

public class QueueRev {
    int que[] = new int[50];
    int size, front, rear;

    QueueRev(int cap) {
        size = cap;
        front = 0;
        rear = 0;
    }

    void add_ele(int n) {
        if (rear == size) {
            System.out.println("Queue Overflow");
        } else {
            if (rear == 0 && front == 0) {
                rear = 1;
                front = 1;
            } else {
                rear += 1;
            }
            que[rear] = n;
        }
    }

    void rev() {
        if (front == 0 && rear == 0) {
            System.out.println("Queue empty");
        } else {
            System.out.print("Elements of the queue in reverse order: ");
            // runs the loop from rear to front to reverse the elements' order
            for (int i = rear; i >= front; i--) {
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int cap = sc.nextInt();
        QueueRev obj = new QueueRev(cap);

        int choice;

        do {
            System.out.println("\n1. Add element\n2. Reverse order\n3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to be added: ");
                    int ele = sc.nextInt();
                    obj.add_ele(ele);
                    break;

                case 2:
                    obj.rev();
                    break;

                case 3:
                    System.out.println("Terminating program...\nProgram terminated.\n");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 3);
    }
}