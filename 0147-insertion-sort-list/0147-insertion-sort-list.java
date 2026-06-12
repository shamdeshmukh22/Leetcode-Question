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
    public ListNode insertionSortList(ListNode head) {
        ListNode root=head,start=head;
        while(root!=null){
            start=head;
             while(start!=root){
              if(start.val>root.val){
                 int t=start.val;
                 start.val=root.val;
                 root.val=t;
                //  break;
              }
              start=start.next;
            }
            root=root.next;
        }
        return head;
    }
}