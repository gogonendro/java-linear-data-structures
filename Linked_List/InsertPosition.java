package Linked_List;

import java.util.*;

public class InsertPosition {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // inserting element
    void insertEle(int data) {
        Node newNode = new Node(data);
        Node current = head;

        if (this.head == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    boolean insertPos(int data, int pos, int n) {

        // check for invalidity
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position");
            return false;
        }

        // when position to be inserted is 1, follow 'insertBeginning' method
        else if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return true;
        }

        // check for any position greater than 1
        else {
            Node newNode = new Node(data);
            Node current = head;
            // runs until current is one position before the insertion position
            for (int i = 0; i < pos - 2; i++) {
                current = current.next;
            }
            newNode.next = current.next; // newNode points to the node currently after current
            current.next = newNode; // insert newNode in the position after the current
            return true;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertPosition ip = new InsertPosition();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            ip.insertEle(sc.nextInt());
        }

        System.out.print("Linked list: ");
        ip.printList();

        System.out.print("\n\nEnter another element: ");
        int ele = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        if (ip.insertPos(ele, pos, n)) {
            System.out.println("Linked list: ");
            ip.printList();
        }

        sc.close();
    }
}
