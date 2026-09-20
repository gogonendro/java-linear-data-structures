package Stack;

import java.util.*;

public class StackSearch {
    // instance variables
    int arr[];
    int size;
    int top;

    // default constructor to initialize variables
    StackSearch() {
        size = 50;
        top = -1;
        arr = new int[size];
    }

    // parameterized constructor to determine the capacity of the stack
    StackSearch(int cap) {
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
        }
    }

    // method to search for element and determine the position of the found element
    // from the top
    int search(int s) {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        } else {
            for (int i = top; i >= 0; i--) {
                if (s == arr[i]) {
                    return top - i + 1; // returns the position of the element from the top
                }
            }
        }
        return -1;
    }

    // method to display the stack
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

        StackSearch ob = new StackSearch(n);

        // push elements into stack
        System.out.println("Enter integers to be pushed:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ob.push(val);
        }

        ob.display();

        System.out.println("Enter the integer to be searched for:");
        int s = sc.nextInt();
        int pos = ob.search(s); // stores the position of the element

        if (pos != -1) {
            System.out.println("Element found at position " + pos + " from the top");
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
