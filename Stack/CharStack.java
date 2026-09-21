package Stack;

import java.util.*;

public class CharStack {
    // instance variables
    char arr[];
    int top;
    int size;

    // default constructor to initialize variables
    CharStack() {
        size = 50; // default size 50
        top = -1; // position of top element when stack empty
        arr = new char[size];
    }

    // parameterized constructor to determine the capacity of the stack
    CharStack(int cap) {
        if (cap > 0 && cap <= 50) {
            size = cap;
        } else {
            size = 50;
            System.out.println("Invalid size. Default size 50 selected");
        }
        top = -1;
        arr = new char[size];
    }

    // method to push element
    void push(char ch) {
        if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            arr[top] = ch;
            System.out.println(ch + " is pushed into the stack");
        }
    }

    // method to pop element
    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println(arr[top] + " is popped from the stack");
            top--;
        }
    }

    // method to peek
    void peek() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            System.out.println("Top element is " + arr[top]);
        }
    }

    // method to display elements
    void display() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();
        CharStack ob = new CharStack(size);

        int choice;

        do {
            System.out.println("\n----- STACK MENU -----\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a character:");
                    char value = sc.next().charAt(0);
                    ob.push(value);
                    break;

                case 2:
                    ob.pop();
                    break;

                case 3:
                    ob.peek();
                    break;

                case 4:
                    ob.display();
                    break;

                case 5:
                    System.out.println("Program terminated");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}
