package Stack;

import java.util.*;

public class StackMin {
    // instance vars
    int arr[];
    int top;
    int size;

    // default constructor to initialize vars
    StackMin() {
        size = 50; // default size of stack
        top = -1;
        arr = new int[size];
    }

    // parameterized constructor to determine the capacity of stack
    StackMin(int cap) {
        if (cap > 0 && cap <= 50) {
            size = cap;
        } else {
            size = 50;
            System.out.println("Invalid size. Default size 50 selected");
        }
        arr = new int[size];
        top = -1;
    }

    // pushing elements into stack
    void push(int n) {
        if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            arr[top] = n;
            System.out.println(n + " has been pushed into the stack");
        }
    }

    // getting the smallest element in the stack
    void getMin() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            int min = arr[top];
            for (int i = 0; i <= top; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println(min);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack:");
        int n = sc.nextInt();
        StackMin ob = new StackMin(n);

        int choice;

        do {
            System.out.println("----STACK MENU----\n1. Push\n2. Get Smallest Element\n3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to be pushed:");
                    int val = sc.nextInt();
                    ob.push(val);
                    break;

                case 2:
                    System.out.println("Smallest element in the stack:");
                    ob.getMin();
                    break;

                case 3:
                    System.out.println("Program terminated");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 3);

        sc.close();
    }
}
