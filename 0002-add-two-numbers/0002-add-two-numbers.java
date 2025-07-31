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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();// time:O(max(m,n)) space:O(n) for creating new ll
        ListNode temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {//adding all vals in l1
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {//adding all vals in l2
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;//adding any leftover carry from the previous addition
            carry = sum / 10;//calculating new carry
            ListNode node = new ListNode(sum % 10);//Creating a new node for the ones digit of the sum
            temp.next = node; //new node to prev node (addition is from back to front)
            temp = temp.next;
        }
        return dummy.next;
    }
}