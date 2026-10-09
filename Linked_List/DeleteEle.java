package Linked_List;

import java.util.*;

public class DeleteEle {
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

    boolean delEle(int ele) {
        Node current = head;

        if (current == null) {
            System.out.println("List empty");
            return false;
        }
        // if element present in the first node
        else if (head.data == ele) {
            head = head.next;
            return true;
        } else {
            while (current.next != null) {
                if (current.next.data == ele) {
                    current.next = current.next.next;
                    return true;
                }
                current = current.next;
            }
            System.out.println("Element not found");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteEle de = new DeleteEle();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            de.insert(sc.nextInt());
        }

        System.out.print("Linked List: ");
        de.printList();

        System.out.print("\nEnter element to be deleted: ");
        int ele = sc.nextInt();

        if (de.delEle(ele)) {
            System.out.println(ele + " successfully deleted from the list.");
            System.out.print("Updated Linked List: ");
            de.printList();
        }

        sc.close();
    }
}
