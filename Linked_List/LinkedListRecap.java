package Linked_List;

import java.util.*;

public class LinkedListRecap {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void input(int data) {
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

    void insertBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    boolean insertPos(int data, int pos, int n) {
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid");
            return false;
        } else if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return true;
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < pos - 2; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return true;
        }
    }
}
