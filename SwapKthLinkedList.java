//Given a linked list, swap the kth element from the start with the kth element from the end.

public class SwapKthLinkedList{

  static class Node{
    int val;
    Node next;
    Node(int val){
      this.val = val;
    }
  }

  void swap(Node head, int k){
    Node pointer1 = head;
    Node pointer2 = head;
    Node prevPointer1 = null;
    Node prevPointer2 = null;
    for(int i=0;i<k;i++){
      prevPointer1 = pointer1;
      pointer1 = pointer1.next;
    }
    Node pointerToBeSwapped = pointer1;
    while(pointer1.next!=null){
      pointer1 = pointer1.next;
      prevPointer2 = pointer2;
      pointer2 = pointer2.next;
    }
    //TODO Swap the elements chainging the pointer
  }

}
