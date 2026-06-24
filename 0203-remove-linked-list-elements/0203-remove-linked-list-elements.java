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
    public ListNode removeElements(ListNode head, int key) {
        if(head==null) return head;
        ListNode root=head;
        while(head!=null && head.val == key){
             head = head.next;
        }

        while(root!=null && root.next!=null){
            if(root.next.val==key){
               root.next=root.next.next;
            }
            else root=root.next;
        }
        // if(root.val==key) return null;
        return head;
    }
}