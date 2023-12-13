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
        // Test 1: Dodanie elementu na początku listy
        doubleLinkedList.addNodeAtIndex(0, "A");
        assertEquals("A", doubleLinkedList.head.data);
        assertEquals(1, doubleLinkedList.getSize());

        // Test 2: Dodanie elementu na końcu listy
        doubleLinkedList.addNodeAtIndex(1, "B");
        assertEquals("B", doubleLinkedList.tail.data);
        assertEquals(2, doubleLinkedList.getSize());

        // Test 3: Dodanie elementu na indeksie w środku listy
        doubleLinkedList.addNodeAtIndex(1, "X");
        assertEquals("X", doubleLinkedList.getIndex(1).data);
        assertEquals(3, doubleLinkedList.getSize());
//
//        // Test 4: Sprawdzenie poprawności referencji
//        assertEquals("A", doubleLinkedList.head.next.data);
//        assertEquals("X", doubleLinkedList.getIndex(1).data);
//        assertEquals("B", doubleLinkedList.tail.previous.data);
//
//        // Test 5: Dodanie elementu na końcu listy
//        doubleLinkedList.addNodeAtIndex(3, "C");
//        assertEquals("C", doubleLinkedList.tail.data);
//        assertEquals(4, doubleLinkedList.getSize());
//
//        // Test 6: Sprawdzenie poprawności referencji po dodaniu na końcu
//        assertEquals("B", doubleLinkedList.tail.previous.data);
//        assertEquals("C", doubleLinkedList.tail.data);
//        assertNull(doubleLinkedList.tail.next);
//
//        // Test 7: Próba dodania na nieistniejącym indeksie
//        assertThrows(IndexOutOfBoundsException.class, () -> {
//            doubleLinkedList.addNodeAtIndex(10, "D");
//        });
    }

    @Test
    void removeNodeAtIndex() {
    }
}