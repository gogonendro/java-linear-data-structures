package Stack;

import java.util.*;

public class StringRev {
    Scanner sc = new Scanner(System.in);
    String w;
    char arr[];
    int l, top;

    void acc() {
        System.out.println("Enter a word:");
        w = sc.next();
        l = w.length();

        arr = new char[l];
        top = -1; // top must always be initialized with -1
    }

    void push() {
        for (int i = 0; i < l; i++) {
            top++; // increase top by 1
            arr[top] = w.charAt(i); // put the character in the new place
        }
    }

    void dispRev() {
        System.out.println("Reverse of word:");

        while (top >= 0) {
            System.out.print(arr[top]); // top --> bottom, hence reverse of word
            top--;
        }
    }

    public static void main(String[] args) {
        StringRev obj = new StringRev();
        obj.acc();
        obj.push();
        obj.dispRev();
        obj.sc.close();
    }
}
