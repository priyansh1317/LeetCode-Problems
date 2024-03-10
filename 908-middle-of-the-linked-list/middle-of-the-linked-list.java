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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        double len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        double midPos = len/2;
        if(midPos-(int)midPos>0){
            for(int i=0;i<(int)midPos;i++){
                temp=temp.next;
            }
            return temp;
        }
        else{
            for(int i=0;i<(int)midPos;i++){
                temp=temp.next;
            }
            return temp;
        }
    }
}