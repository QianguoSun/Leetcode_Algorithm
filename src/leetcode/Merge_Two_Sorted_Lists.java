package leetcode;

public class Merge_Two_Sorted_Lists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head,curr;
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val <= l2.val){
            head = l1;
            curr = l1;
            l1 = l1.next;
        }else{
            head = l2;
            curr = l2;
            l2 = l2.next;
        }
        while (l1 != null && l2 !=null){
            if(l1.val < l2.val){
                curr.next = l1;
                curr  =curr.next;
                l1 = l1.next;
            }else{
                curr.next = l2;
                curr  =curr.next;
                l2 = l2.next;
            }

        }
        if (l1 !=null){
            curr.next = l1;
        }
        if(l2 !=null){
            curr.next = l2;
        }
        return head;
    }
    public static void main(String[] args){

    }
}
