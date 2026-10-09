package Linked_List;

import java.util.*;

public class SortList {
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

    void sort() {
        Node i;
        Node j = null;
        int temp;

        if (head == null) {
            return;
        } else {
            // traverse through the list
            for (i = head; i != null; i = i.next) {
                // traverse through the unsorted part of the list
                for (j = i.next; j != null; j = j.next) {
                    if (i.data > j.data) {
                        temp = i.data;
                        i.data = j.data;
                        j.data = temp;

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortList sl = new SortList();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            sl.insert(sc.nextInt());
        }

        System.out.print("Unsorted linked list: ");
        sl.printList();

        sl.sort();
        System.out.print("\nSorted linked list: ");
        sl.printList();

        sc.close();
    }
}
