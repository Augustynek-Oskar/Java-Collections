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
    @DisplayName("Should test adding nodes at index X and their references ")
    void addNodeAtIndex() {
        doubleLinkedList.addNode("One");
        doubleLinkedList.addNode("Two");
        doubleLinkedList.addNode("Three");
        // One <-> Two <-> Three

        doubleLinkedList.addNodeAtIndex(0, "Zero");
        assertEquals("Zero", doubleLinkedList.head.data);
        assertEquals("One", doubleLinkedList.head.next.data);
        assertEquals("Zero", doubleLinkedList.head.next.previous.data);
        assertEquals(4, doubleLinkedList.getSize());
        // (Zero) <-> One <-> Two <-> Three

        doubleLinkedList.addNodeAtIndex(4, "Four");
        assertEquals("Four", doubleLinkedList.tail.data);
        assertEquals("Three", doubleLinkedList.tail.previous.data);
        assertEquals("Four", doubleLinkedList.tail.previous.next.data);
        assertEquals(5, doubleLinkedList.getSize());
        // Zero <-> One <-> Two <-> Three <-> (Four)

        doubleLinkedList.addNodeAtIndex(2, "Five");
        assertEquals("Five", doubleLinkedList.getIndex(2).data);
        assertEquals("Five", doubleLinkedList.getIndex(1).next.data);
        assertEquals("Five", doubleLinkedList.getIndex(3).previous.data);
        assertEquals(6, doubleLinkedList.getSize());
        // Zero <-> One <-> (Five) <-> Two <-> Three <-> Four


        assertThrows(IndexOutOfBoundsException.class, () -> {doubleLinkedList.addNodeAtIndex(10, "Eleven");
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {doubleLinkedList.addNodeAtIndex(-1, "MinusOne");
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {doubleLinkedList.addNodeAtIndex(7, "Eight");
        });
    }

    @Test
    void removeNodeAtIndex() {
    }
}