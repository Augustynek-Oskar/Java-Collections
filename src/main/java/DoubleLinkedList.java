public class DoubleLinkedList {
    class Node {
        String data;
        Node next;
        Node previous;
        public Node(String data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    public void addNode(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
}
