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
import java.util.HashSet;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Create a set to store the values to be deleted for quick lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Create a dummy node to handle edge cases (like when head needs to be deleted)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        // Traverse the list and delete nodes whose values are in the set
        while (curr != null && curr.next != null) {
            if (set.contains(curr.next.val)) {
                // Delete the node by skipping it
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        // Return the modified list (the real head might have changed)
        return dummy.next;
    }
}
