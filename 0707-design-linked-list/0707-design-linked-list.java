class MyLinkedList {
    private class ListNode{
      int val;
      ListNode next=null;
      ListNode(int val){
        this.val=val;
      }
    }
    ListNode  head=null,tail=null;
    int size=0;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index>=size || index<0){
            return -1;
        }
        ListNode root=head;
        for(int i=0;i<index;i++){
            root=root.next;
        }
        return root.val;
        
    }
    
    public void addAtHead(int val) {
        ListNode root=new ListNode(val);
        size++;
        if(head==null){
            head=tail=root;
            return;
        }
        root.next=head;
        head=root;
    }
    
    public void addAtTail(int val) {
        ListNode root=new ListNode(val);
        size++;
        if(head==null){
            head=tail=root;
            return;
        }

       tail.next=root;
       tail=root;        
    }
    
    public void addAtIndex(int index, int val) {
      if(index>size || index<0) return;
        if(index==0){
            addAtHead(val);
            return;
        }
 
        if(index==size){
            addAtTail(val);
            return;
        }
         ListNode root=new ListNode(val);
        ListNode temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        root.next=temp.next;
        temp.next=root; 
        size++; 

    }
    
    public void deleteAtIndex(int index) {
        if(head==null || index>=size || index<0){
            return;
        }
        if(index==0){
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return;
        }
         ListNode root=head;
        for (int i = 0; i < index - 1; i++) {
            root = root.next;
        }
        if(root.next == tail){
    tail = root;
 }
        root.next=root.next.next;
        
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */