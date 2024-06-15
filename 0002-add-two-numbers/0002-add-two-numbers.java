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
    ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        ListNode nex=null;
        while(curr!=null){
            nex=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nex;
        }
        return pre;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a=l1;
        ListNode b=l2;
        ListNode res=new ListNode();
        ListNode temp=res;
        int carry=0;
        while((a!=null || b!=null) ||( carry==1)){
            int sum=0;
            if(a!=null){
                sum+=a.val;
                a=a.next;
            }
            if(b!=null){
                sum+=b.val;
                b=b.next;
            }
            sum+=carry;
            carry=0;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            ListNode node=new ListNode(sum);
            temp.next=node;
            temp=temp.next;
        }

        return res.next;
    }
}