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
        ListNode pointer = head;
        ListNode fast = head;
        ListNode slow = head;
        int lenCycle=0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                while(slow!=pointer){
                    slow=slow.next;
                    pointer=pointer.next;
                }
                return pointer;
            }
        }
        return null;
    }
}