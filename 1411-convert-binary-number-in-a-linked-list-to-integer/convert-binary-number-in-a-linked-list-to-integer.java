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
    public int getDecimalValue(ListNode head) {
        //to calculate the length of LL
        ListNode temp = head;
        int length=0;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
    
        int sum=0;
        while(head!=null){
            if(head.val==1){
                sum+=Math.pow(2,length);
                length--;
                head=head.next;
            }
            else{
                head=head.next;
                length--;
            }
        }
        return sum;
    }
}