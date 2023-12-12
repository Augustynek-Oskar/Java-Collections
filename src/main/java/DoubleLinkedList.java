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
    int size;
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
    public static int size(Node head){
        int count = 1;
        Node current = head;
        while (current.next != null){
            current = current.next;
            count += 1;
        }
        return count;
    }
    public void addNodeAtIndex (int index, String data){
        Node newNode = new Node(data);
        if (index == 0){
            newNode.next = head;
            if (head != null){
                head.previous = newNode;
            }
            head = newNode;
        }
        else if (index == size){
            newNode.previous = tail;
            if (tail != null){
                tail.next = newNode;
            }
            tail = newNode;
        }

    }
}
