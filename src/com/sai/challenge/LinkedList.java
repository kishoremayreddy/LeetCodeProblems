package com.sai.challenge;

import java.util.ArrayList;
import java.util.Random;

public class LinkedList {
    public static LinkedListNode insert_at_head(LinkedListNode head, int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        newNode.next = head;
        return newNode;
    }

    public static LinkedListNode insert_at_tail(LinkedListNode head, int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (head == null) {
            return newNode;
        }
        LinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static LinkedListNode insert_at_tail(LinkedListNode head, LinkedListNode node)
    {
        if (head == null) {
            return node;
        }
        LinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    public static LinkedListNode create_linked_list(ArrayList<Integer> lst) {
        LinkedListNode head = null;
        LinkedListNode tail = null;
        for (Integer x : lst) {
            LinkedListNode newNode = new LinkedListNode(x);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }

    public static LinkedListNode create_linked_list(int[] arr) {
        LinkedListNode head = null;
        LinkedListNode tail = null;
        for (int i = 0; i < arr.length; ++i) {
            LinkedListNode newNode = new LinkedListNode(arr[i]);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }

    public static LinkedListNode create_random_list(int length) {
        LinkedListNode list_head = null;
        Random generator = new Random();
        for(int i = 0; i < length; ++i) {
            list_head = insert_at_head(list_head, generator.nextInt(100));
        }
        return list_head;
    }

    public static ArrayList<Integer> to_list(LinkedListNode head) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        LinkedListNode temp = head;
        while (temp != null) {
            lst.add(temp.data);
            temp = temp.next;
        }
        return lst;
    }

    public static void display(LinkedListNode head) {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.printf("%d, ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static LinkedListNode merge_alternating(LinkedListNode list1, LinkedListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        LinkedListNode head = list1;

        while (list1.next != null && list2 != null) {
            LinkedListNode temp = list2;
            list2 = list2.next;

            temp.next = list1.next;
            list1.next = temp;
            list1 = temp.next;
        }

        if (list1.next == null) {
            list1.next = list2;
        }

        return head;
    }

    static boolean is_equal(LinkedListNode list1, LinkedListNode list2) {
        if (list1 == list2) {
            return true;
        }

        while (list1 != null && list2 != null) {
            if (list1.data != list2.data) {
                return false;
            }

            list1 = list1.next;
            list2 = list2.next;
        }

        return (list1 == list2);
    }
}
