public class DoubleLinkedList {
    Node head = null;
    Node tail = null;
    int size;

    static class Node {
        String data;
        Node next;
        Node previous;
        public Node(String data) {
            this.data = data;
        }
    }

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
        size++;
    }
    public int getSize(){
        return size;
    }
    public void addNodeAtIndex (int index, String data){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Non-existent index!");
        }

        Node newNode = new Node(data);
        if (index == 0){
            newNode.next = head;
            newNode.previous = null;
            if (head != null){
                head.previous = newNode;
            }
            head = newNode;
        }
        else if (index == size){
            newNode.previous = tail;
            newNode.next = null;
            if (tail != null){
                tail.next = newNode;
            }
            tail = newNode;
        }
        else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException("Invalid index");
                }
                current = current.next;
            }
            if (current != null) {
                newNode.previous = current.previous;
                newNode.next = current;
                if (current.previous != null) {
                    current.previous.next = newNode;
                }
                current.previous = newNode;
            }
        }
        size++;
    }
    public Node getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        return current;
    }
    public void removeNodeAtIndex (int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Non-existent index!");
        }
        Node current = getIndex(index);
        if (current.previous == null){
            head = current.next;
        }
        else {
            current.previous.next = current.next;
        }
        if (current.next == null){
            tail = current.previous;
        }
        else {
            current.next.previous = current.previous;
        }
        size--;
    }

}
