package Queue;

import java.util.*;

public class QueAvg {
    int que[] = new int[50];
    int size, front, rear;

    QueAvg(int cap) {
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

    void getAvg() {
        int sum_ele = 0;
        int avg_ele = 0;
        if (front == -1 && rear == -1) {
            System.out.println("QUEUE EMPTY!");
        } else {
            System.out.print("Average of the elements in queue: ");
            for (int i = front; i <= rear; i++) {
                sum_ele += que[i];
            }
            int ele_count = rear - front + 1;
            avg_ele = sum_ele / ele_count;
            System.out.println(avg_ele);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int cap = sc.nextInt();
        QueAvg ob = new QueAvg(cap);

        int ch;

        do {
            System.out.println("\n1. Add element\n2. Get average\n3. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter an integer: ");
                    int val = sc.nextInt();
                    ob.add_ele(val);
                    break;

                case 2:
                    ob.getAvg();
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
