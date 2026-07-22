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
    public ListNode[] reverse(ListNode root){
        ListNode prev=null,c=root,f=null;
        while(c!=null){
            f=c.next;
            c.next=prev;
            prev=c;
            c=f;
        }
        return new ListNode[]{prev,root};
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;
       ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode root = dummy;

        for(int i=1;i<left;i++){
            root=root.next;
        }
         ListNode curr =root.next; 
        for(int i=1;i<=right-left;i++){
            curr=curr.next;
        }
  
       ListNode  nextPart=curr.next; 
       curr.next=null;

        ListNode arr[]=reverse(root.next);
        root.next=arr[0];
        arr[1].next=nextPart;
        return dummy.next;

    }
}