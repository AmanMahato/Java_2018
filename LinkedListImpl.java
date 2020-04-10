public class LinkedListImpl{

  static class Node{
    int val;
    Node next;

    Node(int val){
      this.val = val;
      next = null;
    }

  }

  public static void main(String[] args){
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    //printist(head);
    //System.out.println(sizeOfList(head));
    //Node reversedList = revereList(head);
    //printist(head);
    printBackWard(head);
  }

  public static Node addAtFirst(Node head, int val){
    Node toBeAdded = new Node(val);
    if(head == null) return toBeAdded;
    toBeAdded.next = head;
    head = toBeAdded;
    return head;
  }

  public static Node addAtLast(Node head, int val){
    Node toBeAdded = new Node(val);
    if(head == null) return toBeAdded;
    Node result = head;
    while(head!=null){
      head = head.next;
    }
    head = toBeAdded;
    return result;
  }

  public static void printist(Node head){
    if(head == null){
      System.out.println("Emply List");
    }
    while(head!=null){
      System.out.println(head.val);
      head = head.next;
    }
  }

  public static Node removeElement(Node head, int element){
    if(head == null) return head;
    if(head.val == element) return null;
    Node result = head;
    while(head.next!=null){
      if(head.next.val == element){
        head.next = head.next.next;
      }
      head = head.next;
    }
    return result;
  }

  public static Node revereList(Node head){
    if (head==null || head.next==null) return head;
  		Node reversedList=revereList(head.next);
  		head.next.next=head;
  		head.next=null;
  		return reversedList;
  }

 //Copied from Leetcode  1 → 2 → 3 → Ø --> Ø ← 1 ← 2 ← 3
 public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode current = head;
       while(current!=null){
           ListNode nextOfCurrent = current.next;
           current.next = prev;
           prev = current;
           current = nextOfCurrent;
       }
       return head;
   }

  public static int sizeOfList(Node head){
    int count = 0;
    if (head == null) return count;
    while(head!=null){
      count++;
      head = head.next;
    }
    return  count;
  }

  public static void printBackWard(Node head){
    if(head == null){
      //System.out.println(head.val);
      return;
    }
    printBackWard(head.next);
    System.out.println(head.val);

//TODO
  }


  public static boolean detectLoop(Node head){
    if(head == null) return true;
    Node slowRunner = head;
    Node fastRunner = head;
    while(slowRunner!=null && fastRunner!=null && fastRunner.next!=null){
      fastRunner = fastRunner.next.next;
      slowRunner = slowRunner.next;
      if(slowRunner==fastRunner) return true;
    }
    return false;
  }

}
