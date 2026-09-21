package Stack;

import java.util.*;

public class StackSum {
    int arr[];
    int top;
    int size;

    StackSum() {
        size = 50;
        top = -1;
        arr = new int[size];
    }

    StackSum(int cap) {
        if (cap > 0 && cap <= 50) {
            size = cap;
        } else {
            size = 50;
            System.out.println("Invalid size. Default size 50 selected");
        }
        arr = new int[size];
        top = -1;
    }

    void push(int n) {
        if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            arr[top] = n;
            System.out.println(n + " has been pushed into the stack");
        }
    }

    void add() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            int sum = 0;
            for (int i = 0; i <= top; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack:");
        int n = sc.nextInt();
        StackSum ob = new StackSum(n);

        int choice;

        do {
            System.out.println("----STACK MENU----\n1. Push\n2. Get Sum\n3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to be pushed:");
                    int val = sc.nextInt();
                    ob.push(val);
                    break;

                case 2:
                    System.out.println("Sum of all the elements:");
                    ob.add();
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
