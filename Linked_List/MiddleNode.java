package Linked_List;

import java.util.*;

public class MiddleNode {
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

    boolean midEle(int n) {
        Node current = head;
        if (current == null) {
            System.out.println("List empty");
            return false;
        } else {
            for (int i = 0; i < n / 2; i++) {
                current = current.next;
            }
            System.out.println("\nMiddle element: " + current.data);
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiddleNode mn = new MiddleNode();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            mn.insert(sc.nextInt());
        }

        System.out.print("Linked List: ");
        mn.printList();

        mn.midEle(n);

        sc.close();
    }
}
