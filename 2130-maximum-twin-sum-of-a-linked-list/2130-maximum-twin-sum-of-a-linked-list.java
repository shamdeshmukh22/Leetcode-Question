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
        fast=reverse(slow);
        slow=head;
        int max=0;
        while(fast != null && slow !=null){
           max=Math.max(max,slow.val+fast.val);
           slow=slow.next;
           fast=fast.next;
        }
       // System.out.println(slow.val);
        return max;
    }
}