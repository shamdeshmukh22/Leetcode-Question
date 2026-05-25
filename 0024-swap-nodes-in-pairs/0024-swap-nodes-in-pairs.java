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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
      ListNode dumpy=new ListNode(-1);
      ListNode temp=dumpy,a=head,b=head.next;
      while(a!=null && b!=null){
        temp.next=b;
        a.next=b.next;
        b.next=a;
       temp=a;
        a=a.next;
        if(a!=null) b=a.next;
      }
      head=dumpy.next;
        return head;

    }
}