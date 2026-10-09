package Linked_List;

import java.util.*;

public class MinNode {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        Node current = head;

        if (this.head == null) {
            this.head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("List empty");
        } else {
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

    int min() {
        Node current = head;
        if (current == null) {
            return 0;
        } else {
            int m = current.data;
            while (current != null) {
                if (current.data < m) {
                    m = current.data;
                }
                current = current.next;
            }
            return m;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinNode mn = new MinNode();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            mn.insert(sc.nextInt());
        }

        System.out.print("Linked List: ");
        mn.printList();

        System.out.print("\nMinimum element: " + mn.min());

        sc.close();
    }
}
