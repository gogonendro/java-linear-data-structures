package Linked_List;

import java.util.*;

public class CountNodes {
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

    int count() {
        Node current = head;
        int c = 0; // counter set to 0

        // when list empty
        if (current == null) {
            return 0; // count must be 0
        } else {
            // run till the last element
            while (current != null) {
                current = current.next; // move to the next element
                c++; // increase count by 1
            }
            return c; // return count
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountNodes cn = new CountNodes();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            cn.insert(sc.nextInt());
        }

        System.out.print("Linked List: ");
        cn.printList();

        System.out.print("\nNumber of nodes: " + cn.count());

        sc.close();
    }
}
