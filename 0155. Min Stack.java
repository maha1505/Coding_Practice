class Node {
    int val;
    Node next;
    int id;
    public Node(int val, int id)
    {
        this.val = val;
        this.id = id;
    }
}
class MinStack {
    Node head;
    Node min;
    int id_count;
    public MinStack()
    {
        id_count = 0;
    }
    public void push(int val)
    {
        Node pushedNode = new Node(val, id_count);
        pushedNode.next = head;
        head = pushedNode;
        if (min == null)
            min = new Node(val, id_count);
        else if (val < min.val)
        {
            Node minNode = new Node(val, id_count);
            minNode.next = min;
            min = minNode;
        }
        id_count++;
    }
    public void pop()
    {
        if (head.id == min.id)
            min = min.next;
        head = head.next;
    }
    public int top() {
        return head.val;
    }
    public int getMin() {
        return min.val;
    }
}
