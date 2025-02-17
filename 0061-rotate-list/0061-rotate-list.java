class Solution {
    ListNode findnthnode(ListNode temp, int k) {
        int cnt = 1;
        while (temp != null) {
            if (cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return null; // Explicitly returning null if node not found (though this case should be prevented)
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;  // Fix edge case handling

        ListNode tail = head;
        int len = 1;

        // Compute the length of the list
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        // If k is a multiple of len, the list remains the same
        k = k % len;
        if (k == 0) return head;

        // Connect tail to head to form a circular linked list
        tail.next = head;

        // Find the new last node
        ListNode newlastnode = findnthnode(head, len - k);
        
        if (newlastnode == null) return head; // Prevent null pointer exception

        head = newlastnode.next;
        newlastnode.next = null; // Break the cycle

        return head;
    }
}
