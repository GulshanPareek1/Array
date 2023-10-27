// for Linked List Questions first try on Pen and Paper Please 
// brute force solution is find length and then remove length-n+1  node 
// we can't traverse back in LL we know 
// after writing the logic go for edge cases
// as here in practice we get them by just hit and trial but try to recognise the edge cases before submitting
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            return null;
        }an just write them fast and slow as usual  / traditional 
      // or we c
        ListNode temp = head;
        ListNode start = head;
            
        for(int i=0;i<n;i++)
        {
            temp = temp.next;
        }
        
        if(temp==null)
        {
            return head.next;
        }
        while(temp.next!=null)
        {
            start = start.next;
            temp=temp.next;
        }
        
        start.next = start.next.next;
        return head;
    }
}
