public class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    public static int getListSize(Node head){
        int count = 1;
        Node current = head;
        while (current.next != null){
            current = current.next;
            count += 1;
        }
        return count;
    }
}
