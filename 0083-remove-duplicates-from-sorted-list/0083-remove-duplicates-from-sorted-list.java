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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dumpy=new ListNode(-1);
        ListNode slow=dumpy,fast=head;
        while(fast!=null&& fast.next!=null){
            while(fast.next!=null && fast.val==fast.next.val){
              fast=fast.next;
            }
            slow.next=fast;
            fast=fast.next;
            slow=slow.next;
        }
        return dumpy.next;
    }

}