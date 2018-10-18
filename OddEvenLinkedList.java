//Odd Even Linked List
//Input: 1->2->3->4->5->NULL
//Output: 1->3->5->2->4->NULL

public class OddEvenLinkedList {

    public static void main(String[] args){

    }

    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode joiningPoint = even;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next=joiningPoint;
        return head;
    }

}
