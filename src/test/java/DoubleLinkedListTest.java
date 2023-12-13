import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {
DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    @Test
    @DisplayName("Tests adding two nodes and checking their references")
    void addNode() {

        doubleLinkedList.addNode("One");
        assertEquals("One",doubleLinkedList.head.data);
        assertEquals(1, doubleLinkedList.getSize());
        //One

        doubleLinkedList.addNode("Two");
        assertEquals("Two", doubleLinkedList.tail.data);
        assertEquals(2, doubleLinkedList.getSize());
        //One Two

        assertEquals("Two", doubleLinkedList.head.next.data);
        assertEquals("One", doubleLinkedList.tail.previous.data);
        //Reference test

        assertNull( doubleLinkedList.head.previous);
        assertNull( doubleLinkedList.tail.next);
        //Checking for head previous and tail next data
    }

    @Test
    @DisplayName("Should return size of the list")
    void getSize() {

        assertEquals(0, doubleLinkedList.getSize());

        doubleLinkedList.addNode("SizeTest");
        assertEquals(1, doubleLinkedList.getSize());
    }

    @Test
    @DisplayName("Tests adding nodes at index X and their references ")
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
    @DisplayName("Tests removing node at given index")
    void removeNodeAtIndex() {

        doubleLinkedList.addNode("One");
        doubleLinkedList.addNode("Two");
        doubleLinkedList.addNode("Three");
        //One Two Three

        doubleLinkedList.removeNodeAtIndex(0);
        assertEquals("Two", doubleLinkedList.head.data);
        assertEquals("Three", doubleLinkedList.head.next.data);
        assertEquals("Two", doubleLinkedList.head.next.previous.data);
        assertEquals(2, doubleLinkedList.getSize());
        //Two Three

        doubleLinkedList.removeNodeAtIndex(1);
        assertEquals("Two", doubleLinkedList.head.data);
        assertEquals("Two", doubleLinkedList.tail.data);
        assertNull(doubleLinkedList.head.next);
        assertEquals(1, doubleLinkedList.getSize());
        //Two

        doubleLinkedList.removeNodeAtIndex(0);
        assertNull(doubleLinkedList.head);
        assertNull(doubleLinkedList.tail);
        assertEquals(0, doubleLinkedList.getSize());
        //null

        assertThrows(IndexOutOfBoundsException.class, () -> {doubleLinkedList.removeNodeAtIndex(0);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {doubleLinkedList.removeNodeAtIndex(-1);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {doubleLinkedList.removeNodeAtIndex(1);
        });
    }

    @Test
    void getIndex() {
        doubleLinkedList.addNode("One");
        doubleLinkedList.addNode("Two");
        doubleLinkedList.addNode("Three");



    }
}