package Queue;

import java.util.*;

public class QueueSearch {
    // instance variables
    int que[] = new int[50]; // default queue size
    int size, front, rear;

    // parameterized constructor to initialize variables and to determine the
    // capacity of the queue
    QueueSearch(int cap) {
        size = cap;
        rear = 0;
        front = 0;
    }

    // adding element
    void add_ele(int n) {

        // when rear equals to size then queue is full
        if (rear == size) {
            System.out.println("Queue Overflow");
        } else {

            // when rear and front is 0 (queue empty), make them one
            if (rear == 0 && front == 0) {
                front = 1;
                rear = 1;

                // if not empty, then increase by one
            } else {
                rear += 1;
            }

            // then add the element in the newly created space
            que[rear] = n;
        }
    }

    // searching an element
    void search_ele(int n) {

        // when rear and front equals 0, then queue is empty
        if (rear == 0 && front == 0) {
            System.out.println("Queue Underflows");
        } else {

            // store front element in n
            int i = 0;
            boolean found = false;

            for (i = front; i <= rear; i++) {
                if (que[i] == n) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Element " + n + " found at position " + i);
            } else {
                System.out.println("Element " + n + " not found in the queue");
            }
        }
    }

    // main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int n = sc.nextInt();

        QueueSearch ob = new QueueSearch(n);

        int choice, element;
        do {
            System.out.println("\n1. Add an element\n2. Search an element\n3. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be added: ");
                    element = sc.nextInt();
                    ob.add_ele(element);
                    break;
                case 2:
                    System.out.print("Enter the element to be searched: ");
                    element = sc.nextInt();
                    ob.search_ele(element);
                    break;
                case 3:
                    System.out.println("Program terminated.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
        sc.close();
    }
}
