/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { //Cycle detected
                slow = head; //if there is a cycle initialize head as slow

                while (slow != fast) {//then move fast and slow pointer one - one step
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;//if the slow and fast pointer mets at a pointer then it is the ans
            }
        }
        
        return null;
    }
}