// Last updated: 8/11/2026, 2:18:29 PM
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr=dummy;
        while(l1!=null && l2!=null){
            if(l1.val <l2.val){ //if l1 is smaller
                curr.next=l1;//add l1
                l1=l1.next;
            }else{
                curr.next=l2;// if l2 is smaller
                l2=l2.next;//add l2
            }
            curr=curr.next;// we have to add next ele to newely added on ele
        }
        if(l1!=null)
        curr.next=l1;
        else if(l2!=null)
        curr.next=l2;
        return dummy.next;
    }
}