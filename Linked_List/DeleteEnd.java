package Linked_List;

import java.util.*;

public class DeleteEnd {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insertion method
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

    boolean delEnd() {
        Node current = head;

        // if list is empty
        if (current == null) {
            return false;
        }

        // if there is one element in the list
        else if (current.next == null) {
            head = null;
            return true;
        }

        // if there is more than one element in the list
        else {
            // runs till second last element
            while (current.next.next != null) {
                current = current.next;
            }
            // sets the last element as null
            current.next = null;
            return true;
        }
    }

    // print method
    void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteEnd de = new DeleteEnd();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            de.insert(sc.nextInt());
        }

        System.out.print("List: ");
        de.printList();

        de.delEnd();
        System.out.print("\nList after deleting last element: ");
        de.printList();

        sc.close();
    }
}