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
    public static ListNode reverse(ListNode root){
         ListNode prev=null,c=root,f=null;
         while(c!=null){
            f=c.next;
            c.next=prev;
            prev=c;
            c=f;
         }
         return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=reverse(slow);
        int max=Integer.MIN_VALUE;

        while(slow!=null){
            max=Math.max(slow.val+head.val,max);
            slow=slow.next;
            head=head.next;
        }
        return max;
    }
}