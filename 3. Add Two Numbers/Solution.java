/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {} // empty listNode
 *     ListNode(int val) { this.val = val; }  //Single node
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            if (l2 == null) {
                return new ListNode();
            } else {
                return new ListNode(l2.val);
            }
        } else if (l2 == null) {
            if (l1 == null) {
                return new ListNode();
            } else {
                return new ListNode(l1.val);
            }
        }
        else if (l1.next == null) {
            if (l2.next == null) {
                 return new ListNode(l1.val+l2.val);
            } else {
                return new ListNode(l2.val, addTwoNumbers(null, l2));
            }
           
        } else if (l2.next == null) {
            if (l1.next == null) {
                 return new ListNode(l1.val+l2.val);
            } else {
                return new ListNode(l1.val, addTwoNumbers(l1, null));
            }
           
        } else {
            if (l1.val + l2.val >= 10){
                int newValue = l1.val + l2.val;
                int storeValue = newValue % 10;
                l1.next.val++;
                return new ListNode(storeValue, addTwoNumbers(l1.next, l2.next));
            } else {
                return new ListNode(l1.val+l2.val, addTwoNumbers(l1.next, l2.next));
            }
        }

    }
}