/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Remove nodes from the start of the list that match the target value
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        // If the list is empty after removals, return null
        if (head == null) {
            return head;
        }
        
        // Traverse the list and remove elements that match the target value
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        
        return head;
    }
}
