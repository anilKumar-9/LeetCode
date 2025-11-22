class LRUCache {
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    Map<Integer,Node> map=new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        head.next=tail;
        tail.prev=head;
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node get=map.get(key);
            remove(get);
            insert(get);
            return get.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            remove(map.get(key));
        }
        if(map.size()==capacity)
        {
            Node node=tail.prev;
            remove(node);
        }
        insert(new Node(key,value));
    }

    void insert(Node node)
    {
        map.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }

    void remove(Node node)
    {
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}

class Node{
    Node next;
    Node prev;
    int key,val;
    Node(int key,int val)
    {
        this.key=key;
        this.val=val;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */