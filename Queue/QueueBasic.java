package Queue;

import java.util.*;

public class QueueBasic {
    // instance variables
    int que[] = new int[50]; // default queue size
    int size, front, rear;

    // parameterized constructor to initialize variables and to determine the
    // capacity of the queue
    QueueBasic(int cap) {
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

    // deleting an element
    int del_ele() {

        // when rear and front equals 0, then queue is empty
        if (rear == 0 && front == 0) {
            System.out.println("Queue Underflows");
            return -9999; // return something to break
        } else {

            // store front element in n
            int n = que[front];

            // front = rear only when they equal to 1 (only one element present), so make
            // them 0 (empty)
            if (front == rear) {
                front = 0;
                rear = 0;

                // if more than one present, increase front by one
            } else {
                front += 1;
            }
            return n; // returns the front element
        }
    }

    void display() {

        // checks if queue is empty
        if (rear == 0 && front == 0) {
            System.out.println("Queue is empty");
            // else print the elements
        } else {
            // runs from front to rear
            for (int i = front; i <= rear; i++) {
                System.out.print(que[i] + "   ");
            }
            System.out.println();
        }
    }

    // main method same as stack
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int n = sc.nextInt();

        QueueBasic ob = new QueueBasic(n);

        int choice;

        do {
            System.out.println(
                    "----QUEUE MENU----\n1. Add an element\n2. Delete an element\n3. Display the queue\n4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be added: ");
                    int x = sc.nextInt();

                    ob.add_ele(x);
                    break;

                case 2:
                    int y = ob.del_ele();

                    if (y != -9999) {
                        System.out.println("Deleted element: " + y);
                    }

                    break;

                case 3:
                    ob.display();
                    break;

                case 4:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
