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
        if(head==null || head.next==null||k==0) return head;
        int size=0;
        ListNode root=head,slow=null;
        while(root!=null){
            slow=root;
            root=root.next;
            size++;
        }
        k%=size;
        if(k==0) return head;
        root=head;
        for(int i=1;i<size-k;i++){
            root=root.next;
        }
        ListNode temp=root.next;
        root.next=null;
        slow.next=head;
        return temp;
    }
}