// desc: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
// Takes root node of linked list and integer of which node to remove from end
// returns root node
// Using one pass with two pointers
package leetcodeMedium;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode start = new ListNode(0);
        start.next = head;
        ListNode left = start;   // Will be pointing one node to the left of the one that will be removed
        ListNode right = start;  // Will be pointing to the end node

        while(n > 0) {
            right = right.next;
            n--;
        }

        while(right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return start.next;
    }
}

// Creating class to remove errors
class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }