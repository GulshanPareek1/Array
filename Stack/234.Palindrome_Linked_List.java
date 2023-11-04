// there are two methods for thi question 
// one using stack and another using simple two pointer approach 
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack stack = new Stack();
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        
        while (head != null) {
            if (head.val != (int)stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}





public boolean isPalindrome(ListNode head) {
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    if (fast != null) { // odd nodes: let right half smaller
        slow = slow.next;
    }
    slow = reverse(slow);
    fast = head;
    
    while (slow != null) {
        if (fast.val != slow.val) {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
    }
    return true;
}

public ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}
