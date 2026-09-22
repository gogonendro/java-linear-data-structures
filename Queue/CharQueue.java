package Queue;

import java.util.*;

public class CharQueue {
    char que[] = new char[50];
    int size, front, rear;

    CharQueue(int cap) {
        size = cap;
        rear = 0;
        front = 0;
    }

    void add_ele(char ch) {

        if (rear == size) {
            System.out.println("Queue Overflow");
        } else {

            if (rear == 0 && front == 0) {
                front = 1;
                rear = 1;
            } else {
                rear += 1;
            }

            que[rear] = ch;
        }
    }

    void del_ele() {

        if (rear == 0 && front == 0) {
            System.out.println("Queue Underflows");
        } else {

            char ch = que[front];

            if (front == rear) {
                front = 0;
                rear = 0;
            } else {
                front += 1;
            }

            System.out.println("Deleted element is: " + ch);
        }
    }

    void display() {

        if (rear == 0 && front == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Elements in the queue are: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int cap = sc.nextInt();
        CharQueue ob = new CharQueue(cap);

        int choice;
        char element;
        do {
            System.out.println("\n1. Add an element\n2. Delete an element\n3. Display the queue\n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be added: ");
                    element = sc.next().charAt(0);
                    ob.add_ele(element);
                    break;
                case 2:
                    ob.del_ele();
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
