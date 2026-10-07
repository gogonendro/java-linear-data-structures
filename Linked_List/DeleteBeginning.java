package Linked_List;

import java.util.*;

public class DeleteBeginning {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // method to insert elements
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

    // delete first node
    boolean delBeginning() {
        // if list is not empty
        if (head != null) {
            head = head.next; // moves head to next node
            return true;
        }
        return false;
    }

    void printList() {
        Node current = head;
        while ((current != null)) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteBeginning db = new DeleteBeginning();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            db.insert(sc.nextInt());
        }

        System.out.print("Linked list: ");
        db.printList();

        if (db.delBeginning()) {
            System.out.print("\nLinked list after deleting first element: ");
            db.printList();
        }

        sc.close();
    }
}