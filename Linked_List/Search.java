package Linked_List;

import java.util.*;

public class Search {
    Node head;

    // basic Node class
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

    // search method
    boolean searchEle(int ele) {
        Node current = head;
        int pos = 1; // set position to 1

        // if current == null, then list is empty
        if (current == null) {
            System.out.println("List empty");
            return false;
        } else {
            // run upto the last element
            while (current != null) {

                // if element in current is not equal to searched element
                if (current.data != ele) {
                    current = current.next; // move to the next element
                    pos++; // increase position by 1
                } else {
                    System.out.println(ele + " present in the position " + pos);
                    return true;
                }
            }
        }

        // when element is not present
        System.out.println(ele + " is not present in the list");
        return false;
    }

    // printing method
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
        Search s = new Search();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            s.insert(sc.nextInt());
        }

        System.out.print("Linked List: ");
        s.printList();

        System.out.print("\nEnter element to be searched for: ");
        int ele = sc.nextInt();

        s.searchEle(ele);

        sc.close();
    }
}
