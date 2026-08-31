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
        ArrayList<Integer>list=new ArrayList<>();
        int lastPrev=head.val,prev=head.next.val;
        head=head.next.next;
        int index=2;
        while(head!=null){
            int n=head.val;
            if(prev>n && prev>lastPrev){
                list.add(index);
            }
            else if(prev<n && lastPrev>prev){
                list.add(index);
            }
            lastPrev=prev;
            prev=n;
            index++;
            head=head.next;
        }
        if(list.size()<2) return new int[]{-1,-1};
        int n=list.size()-1;
      System.out.println(list);
      int min=Integer.MAX_VALUE;
      for(int i=1;i<=n;i++){
         min=Math.min(min,list.get(i)-list.get(i-1));
      }
        int max=list.get(n)-list.get(0);
        return new int[]{min,max};
    }
}