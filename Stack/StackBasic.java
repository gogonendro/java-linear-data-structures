package Stack;

import java.util.*;

public class StackBasic {
    // instance variables
    int arr[];
    int size;
    int top;

    // default constructor to intialize variables
    StackBasic() {
        size = 50;
        top = -1; // when no element present in stack
        arr = new int[size];

    }

    // parameterized constructor to choose the size of the stack
    StackBasic(int cap) {
        // user can choose any number from 1 to 50 (default)
        if (cap > 0 && cap <= 50) {
            size = cap;
        } else {
            size = 50;
            System.out.println("Invalid size. Default size 50 selected");
        }

        arr = new int[size];
        top = -1;
    }

    // insert an element into the stack
    void push(int n) {
        if (top == size - 1) { // when stack full
            System.out.println("Overflow");
        } else {
            top++; // increase the top element pointer
            arr[top] = n; // insert the element in the new space at the top

            System.out.println(n + " is inserted into the stack");
        }
    }

    // remove the top element from the stack
    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println(arr[top] + " is popped from the stack");
            top--; // decrease the top element pointer
        }
    }

    // display the top element
    void peek() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    // display the elements in the stack
    void display() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Stack elements:");

            // loop runs from top to bottom
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack:");
        int n = sc.nextInt();

        StackBasic ob = new StackBasic(n);

        int choice;

        /*
         * do-while loop runs when the choice isn't 5 (5 is the choice to terminate
         * program)
         */
        do {
            System.out.println("\n----- STACK MENU -----\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            // switch case menu-driven block
            switch (choice) {
                case 1:
                    System.out.println("Enter an integer:");
                    int value = sc.nextInt();
                    ob.push(value); // pushes the entered value into the stack
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
