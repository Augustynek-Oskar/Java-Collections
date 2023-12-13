import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {
DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    @Test
    @DisplayName("Adding two nodes and checking their refernces")
    void addNode() {

        //Adding node one
        doubleLinkedList.addNode("One");
        Assertions.assertEquals("One",doubleLinkedList.head.data);
        Assertions.assertEquals(1, doubleLinkedList.getSize());

        //Adding node two
        doubleLinkedList.addNode("Two");
        Assertions.assertEquals("Two", doubleLinkedList.tail.data);
        Assertions.assertEquals(2, doubleLinkedList.getSize());

        //Checking for reference of head and tail
        Assertions.assertEquals("Two", doubleLinkedList.head.next.data);
        Assertions.assertEquals("One", doubleLinkedList.tail.previous.data);

        //Checking for head previous and tail next data
        Assertions.assertNull( doubleLinkedList.head.previous);
        Assertions.assertNull( doubleLinkedList.tail.next);

    }

    @Test
    @DisplayName("Should return size of the list")
    void getSize() {

        Assertions.assertEquals(0, doubleLinkedList.getSize());

        doubleLinkedList.addNode("SizeTest");
        Assertions.assertEquals(1, doubleLinkedList.getSize());
    }

    @Test
    void addNodeAtIndex() {

    }

    @Test
    void removeNodeAtIndex() {
    }
}