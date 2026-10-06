package Linked_List;

import java.util.*;

public class InsertBeginning {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // method to insert element before the previous one
    void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // head becomes the second element
        head = newNode; // now the head is newNode
    }

    // print the list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertBeginning ib = new InsertBeginning();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            ib.insertBeginning(sc.nextInt());
        }

        System.out.println("Linked list: ");
        ib.printList();

        sc.close();

    }
}
