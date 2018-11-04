public class LRUPractise{

static class DoubleLList{
  int val;
  int key;
  DoubleLList prev;
  DoubleLList next;
  DoubleLList(int key,int val){
    this.key = key;
    this.val = val;
    prev=null;
    next=null;
  }
}

  Map<Integer,DoubleLList> map = new HashMap<>();
  int capacity;
  DoubleLList head;
  DoubleLList tail;

  LRUPractise(int capacity){
    this.capacity = capacity;
  }

  public static void main(String[] args){

  }

  public static void put(int key, int value){
    //TODO
    if(map.size()>capacity){
      DoubleLList old = map.get(tail.key);
      remove(old);
      old.key = value;
      setHead(old);
    } else {
      DoubleLList newNode = new DoubleLList(key, value);
      setHead(newNode);
      map.put(key,newNode);
    }
  }

  public static int get(int key){
    //TODO
    if(map.containsKey(key)){
      DoubleLList temp = map.get(key);
      remove(temp);
      setHead(temp);
      return temp.val;
    }
    return -1;
  }

  public static void setHead(DoubleLList node){
    //TODO
    remove(node);
    node.next = head;
    head = node;
  }

  public static void remove(DoubleLList node){
    if(node.prev!=null){
      node.prev.next = node.next;
    } else {
      head = node.next;
      head.prev = null;
    }
    if(node.next!=null){
      node.next.prev = node.prev;
    } else {
      tail = tail.prev;
      tail.next = null;
    }
  }
}
