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
    public ListNode partition(ListNode head, int x) {
        ListNode t1=new ListNode(-1);
        ListNode t2=new ListNode(-1);
        ListNode sm=t1,bg=t2;
        while(head!=null){
              if(head.val<x){
                 sm.next=head;
                 sm=sm.next;
              }
              else{
                 bg.next=head;
                 bg=bg.next;
              }
              head=head.next;
        }
        sm.next=t2.next;
        bg.next=null;
        return t1.next;
    }
}