// Nice Solution just need to be revised for some days then all set 
// little bit lengthy so ...

class LRUCache {

    
    final Node head = new Node();     // we're not making any change in head or tail 
    final Node tail = new Node();
    Map<Integer , Node> map;
    int capacity;
    
    // this is class constructor 
    public LRUCache(int capacity) {
        map = new HashMap(capacity);
        this.capacity = capacity;
        head.next=tail;
        tail.next=head;
    }
    
    public int get(int key) {
        int result=-1;
        Node node = map.get(key);
        if(node!=null)
        {
            remove(node);
            add(node);
            result=node.value;
        }
        
        return result;
    }
    
    // here every operation will be on map and DLL both 
    public void put(int key, int value) {
        Node node = map.get(key);
        if(node!=null)
        {
            remove(node);
            node.value=value;
            add(node);
        }
        else
        {
            
            if(map.size()==capacity)
            {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            map.put(key , newNode);
            add(newNode);
        }
    }
    
    // here operation will be on DLL only
    // remove node from dll
    public void remove(Node node)
    {
        // Remove from  DLL and this we can remove from anywhere  
        Node node_prev = node.prev;
        Node node_next = node.next;
        node_prev.next = node_next;
        node_next.prev = node_prev;
        
    }
    
    // here also operations will be on DLL only 
    // add node in doubly linked list 
    public void add(Node node)
    {
        // will add the node in start of DLL after head
        Node head_next = head.next;
        node.next=head_next;
        head_next.prev= node;
        head.next=node;
        node.prev = head;
    }
    
    class Node{
        int key ;
        int value;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
