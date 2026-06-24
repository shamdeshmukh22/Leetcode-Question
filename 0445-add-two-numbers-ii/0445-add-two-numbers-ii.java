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
    public ListNode reverse(ListNode head){
        ListNode prev=null,c=head,f=null;
        while(c!=null){
            f=c.next;
            c.next=prev;
            prev=c;
            c=f;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
         int count=0;
         ListNode dumpy=new ListNode(-1);
         ListNode temp=dumpy;
         while(l1!=null && l2!=null){
            int total=l1.val+l2.val+count;
            if(total<10){
                 temp.next=new ListNode(total);
                 count=0;
            }
            else{
                temp.next=new ListNode(total%10);
                 count=total/10;
            }
            l1=l1.next;
            l2=l2.next;
            temp=temp.next;
         }
         while(l2!=null){
              int total=l2.val+count;
              if(total<10){
                 temp.next=new ListNode(total);
                 count=0;
            }
            else{
                temp.next=new ListNode(total%10);
                 count=total/10;
            }
            l2=l2.next;
            temp=temp.next;
         }
          while(l1!=null){
              int total=l1.val+count;
              if(total<10){
                 temp.next=new ListNode(total);
                 count=0;
            }
            else{
                temp.next=new ListNode(total%10);
                 count=total/10;
            }
            l1=l1.next;
            temp=temp.next;

         }
          while(count>0){
                 temp.next=new ListNode(count%10);
                 count/=10;
            temp=temp.next;

            }
        return reverse(dumpy.next);
    }
}