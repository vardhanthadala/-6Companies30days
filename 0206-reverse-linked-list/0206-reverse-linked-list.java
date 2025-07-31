
class Solution {
    // iterative approach //
    // time->O(n) space ->O(1)

    // public ListNode reverseList(ListNode head) {
    // ListNode prev = null;
    // ListNode current = head;

    // while (current != null) {
    // ListNode nextNode = current.next;

    // current.next = prev;     //pointing back
    // prev = current;          //moving prev pointer to forward

    // current = nextNode     ; //current = current.next 
    // }

    // return prev;
    // }

    // Recursive approach
    // time->O(n) space->O(n)
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
       
        ListNode head2 = reverseList(head.next);//moving recursively to the end of the list and end element becomes head2
        head.next.next = head;//it makes the next node point back to the current node
        head.next = null;
        return head2;
    }

}