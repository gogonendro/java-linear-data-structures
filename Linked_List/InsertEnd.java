package Linked_List;

import java.util.*;

public class InsertEnd {
    // create head reference
    Node head;

    class Node {
        int data; // int for storing data
        Node next; // node 'next' tracks the next node of a present node

        // parameterized constructor to initialize data
        Node(int data) {
            this.data = data;
            this.next = null; // default set to null
        }
    }

    // insertion of data via method
    void insertEnd(int data) {
        Node newNode = new Node(data); // create new node and accept data input
        Node current = head; // set head to the current node

        // if head is null, means list is empty
        if (this.head == null) {
            this.head = newNode; // set new node as head
        } else {
            // run until last node is reached, whose next node is null
            while (current.next != null) {
                current = current.next; // move current to next node
            }
            // when found last node, add new node as its next node
            current.next = newNode;
        }
    }

    // printing the list
    void printList() {
        Node current = head; // set current node as head

        // run until current becomes null (not current.next)
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // next node becomes current
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertEnd ie = new InsertEnd();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            ie.insertEnd(sc.nextInt());
        }

        System.out.println("Linked list: ");
        ie.printList();

        sc.close();

    }
}