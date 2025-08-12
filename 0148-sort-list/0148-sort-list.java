/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // using merge sort O(NlogN)

    public ListNode sortList(ListNode head) {
        if(head==null ||head.next ==null){
            return head;
        }
        ListNode mid=findMid(head);
        ListNode leftHead=head;
        ListNode rightHead=mid.next;
        mid.next=null;

        leftHead=sortList(leftHead);//recursively sorting
        rightHead=sortList(rightHead);//recursively sorting

        return merge(leftHead,rightHead);
    }

    private ListNode findMid(ListNode head) { // finding mid
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode L1, ListNode L2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (L1 != null && L2 != null) {
            if (L1.val < L2.val) {
                curr.next = L1;
                L1 = L1.next;
            } else {
                curr.next = L2;
                L2 = L2.next;
            }
            curr = curr.next;
        }
        if(L1!=null){
            curr.next=L1;
        }else{
            curr.next=L2;
        }
        return dummy.next;
    }

}