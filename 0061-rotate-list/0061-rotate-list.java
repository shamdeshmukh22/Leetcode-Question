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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int size=0;
        ListNode root=head;
        while(root!=null){
            root=root.next;
            size++;
        }
        k%=size;
        if (k == 0) return head;
        root=head;
       while(root!=null){
        if(size-1==k){
            break;
        }
          root=root.next;
        size--;
       }
       ListNode trans=root.next;
       root.next=null;
       root=trans;
       while(root.next!=null){
           root=root.next;
       }
       root.next=head;
        return trans;
    }
}