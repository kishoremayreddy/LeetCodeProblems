package com.sai.challenge;

import java.util.Arrays;

public class MergeSortedLinkedList {

    public static LinkedListNode merge_sorted(
            LinkedListNode head1,
            LinkedListNode head2) {

        // if both lists are empty then merged list is also empty
        // if one of the lists is empty then other is the merged list
        // maintain an unchanging reference to node ahead of the return node.
        LinkedListNode dummy = new LinkedListNode(-1);

        LinkedListNode head = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                dummy.next = head1;
                head1 = head1.next;
            } else {
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next;
        }

        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
        dummy.next = head1 == null ? head2 : head1;

        return head.next;

    }
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 5, 6};
        int[] arr2 = new int[] {2, 4, 6, 20, 34};
        LinkedListNode list_head1 = LinkedList.create_linked_list(arr1);
        System.out.print("Original1: ");
        LinkedList.display(list_head1);

        LinkedListNode list_head2 = LinkedList.create_linked_list(arr2);
        System.out.print("Original2: ");
        LinkedList.display(list_head2);

        System.out.println("\nMerged:");

        LinkedListNode newHead = merge_sorted(list_head1, list_head2);
        LinkedList.display(newHead);
    }
}
