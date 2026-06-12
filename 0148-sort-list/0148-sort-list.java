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
     public ListNode sortList(ListNode head){
      if(head==null || head.next==null) return head;
         return SpltLinkedList(head);

     }
    public ListNode SpltLinkedList(ListNode head) {
         if (head == null || head.next == null)
            return head;

        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
      fast=slow.next;
        slow.next=null;
      ListNode second=SpltLinkedList(head);
      ListNode first=SpltLinkedList(fast);
        return MergeLinkedList(first,second);
    }
    public ListNode MergeLinkedList(ListNode f1,ListNode f2){
         ListNode dumpy=new ListNode(-1);
         ListNode temp=dumpy;
         while(f1!=null && f2!=null){
             if(f1.val>f2.val){
                temp.next=f2;
                f2=f2.next;
             }
             else{
                 temp.next=f1;
                f1=f1.next;
             }
             temp=temp.next;
         }
         if(f1!=null) temp.next=f1;
         if(f2!=null) temp.next=f2;
         return dumpy.next;
    }
}