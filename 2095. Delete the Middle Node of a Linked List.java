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
    public ListNode deleteMiddle(ListNode head) {
        // int count=0;
        // if(head==null) return head;
        // if(head.next==null) return null;
        // ListNode curr=head;
        // while(curr!=null){
        //     count++;
        //     curr=curr.next;
        // }
        // int mid=count/2 +1;
        // int pos=0;
        // curr=head;
        // ListNode prev=null;
        // while(pos<mid-1){
        //     pos++;
        //     prev=curr;
        //     curr=curr.next;
        // }
        // prev.next=curr.next;
        // return head;
        ListNode slow=head,fast=head,prev=null;
        if(head==null || head.next==null) return null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
        return head;
    }
}
