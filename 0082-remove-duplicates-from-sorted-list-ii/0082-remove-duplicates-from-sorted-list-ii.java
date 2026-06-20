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
        ListNode dumpy=new ListNode(-1);
       dumpy.next=head;
       ListNode conn=dumpy,temp=head;
       while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
              while(temp.next!=null && temp.val==temp.next.val)temp=temp.next;
              conn.next=temp.next;
            }
            else{
                conn=conn.next;
            }
            temp=temp.next;
       }
       return dumpy.next;
    }
}