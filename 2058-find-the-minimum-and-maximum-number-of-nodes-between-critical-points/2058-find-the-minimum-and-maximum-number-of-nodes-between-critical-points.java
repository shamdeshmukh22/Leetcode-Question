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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null) return new int[]{-1,-1};
        int lastPrev=head.val,prev=head.next.val;
        head=head.next.next;
        int index=2,first=-1,last=0;
        int min=Integer.MAX_VALUE;
        while(head!=null){
            int n=head.val;
            if(prev>n && prev>lastPrev){
               if(first!=-1){
                min=Math.min(min,index-last);
                    last=index; 
               }
               if(first==-1) {first=index; last=first;}
            }
            else if(prev<n && lastPrev>prev){
               if(first!=-1){
                min=Math.min(min,index-last);
                    last=index; 
               }
            if(first==-1) {first=index; last=index;}
            }
            lastPrev=prev;
            prev=n;
            index++;
            head=head.next;
        }
      if(min==Integer.MAX_VALUE) return new int[]{-1,-1};
     int max=last-first;
        return new int[]{min,max};
    }
}