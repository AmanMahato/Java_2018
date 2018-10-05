class LRUCache {

    static class DLList{
        int key;
        int value;
        DLList next;
        DLList prev;
        DLList(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    Map<Integer,DLList> map = new HashMap<>();
    int capacity;
    DLList head;
    DLList end;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            DLList temp = map.get(key);
            remove(temp);
            setHead(temp);
            return temp.value;
        }
        return -1;
    }

    public void remove(DLList node){
        if(node.prev!=null){
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if(node.next!=null){
            node.next.prev = node.prev;
        } else {
            end = node.prev;
        }
    }

    public void setHead(DLList node){
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        if(end==null){
            end = head;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            DLList temp = map.get(key);
            remove(temp);
            temp.value = value;
            setHead(temp);
            //map.put(key,temp);
        } else {
            DLList newNode = new DLList(key,value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(newNode);
            } else {
                setHead(newNode);
            }
            map.put(key,newNode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */