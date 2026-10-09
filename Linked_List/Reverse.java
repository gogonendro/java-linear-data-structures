package Linked_List;

import java.util.*;

public class Reverse {
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

    // recursive technique to print in reverse
    void printRev(Node head) {
        if (head == null) {
            return;
        }

        printRev(head.next);

        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse r = new Reverse();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            r.insert(sc.nextInt());
        }

        System.out.print("Linked list: ");
        r.printList();

        System.out.print("\nLinked list in reverse: ");
        r.printRev(r.head);

        sc.close();
    }
}
