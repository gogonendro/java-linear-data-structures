package Stack;

import java.util.*;

public class EvenOdd {
    // instance variables
    int arr[];
    int top;
    int size;

    // default constructor to initialize variables
    EvenOdd() {
        size = 50; // default size 50
        top = -1; // position of top element when stack empty
        arr = new int[size];
    }

    // parameterized constructor to determine the capacity of the stack
    EvenOdd(int cap) {
        if (cap > 0 && cap <= 50) {
            size = cap;
        } else {
            size = 50;
            System.out.println("Invalid size. Default size 50 selected");
        }
        arr = new int[size];
        top = -1;
    }

    // method to push elements into the stack
    void push(int n) {
        if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            arr[top] = n;
            System.out.println(n + " has been pushed into the stack");
        }
    }

    // method to calculate sum of digits of each element
    void count() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            // counters for even and odd numbers
            int even = 0;
            int odd = 0;
            for (int i = 0; i <= top; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println("Number of even numbers: " + even);
            System.out.println("Number of odd numbers: " + odd);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack:");
        int n = sc.nextInt();
        EvenOdd ob = new EvenOdd(n);

        int choice;

        do {
            System.out.println("----STACK MENU----\n1. Push\n2. Get Even-Odd counting\n3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to be pushed:");
                    int val = sc.nextInt();
                    ob.push(val);
                    break;

                case 2:
                    ob.count();
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
