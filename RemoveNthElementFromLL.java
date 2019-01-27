//Remove Nth Node From End of List
//Given linked list: 1->2->3->4->5, and n = 2.
//After removing the second node from the end, the linked list becomes 1->2->3->5.


public class RemoveNthElementFromLL{

  public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode temp = new ListNode(0);
          ListNode slow = temp;
          ListNode fast = temp;
          slow.next = head;
          for(int i=1;i<=n+1;i++){
              fast = fast.next;
          }
          while(fast!=null){
              fast = fast.next;
              slow = slow.next;
          }
          slow.next = slow.next.next;
          return temp.next; //what happens if we return head
      }

}
