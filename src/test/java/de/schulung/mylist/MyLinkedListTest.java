package de.schulung.mylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    private MyLinkedList<String> list;

    @BeforeEach
    public void setUp() {
        list = new MyLinkedList<>();
    }

    @Test
    void newList() {
        assertEquals(0, list.size());
        assertNull(list.get(0));
    }

    @Test
    void addFirstElement() {
        list.add("John");

        assertEquals(1, list.size());
        assertEquals("John", list.get(0));
    }

    @Test
    void removeLastAvailableElement() {
        list.add("John");
        list.remove(0);

        assertEquals(0, list.size());
        assertNull(list.get(0));
    }

    @Test
    void removeFirstElement() {
        list.add("John");
        list.add("Paul");

        list.remove(0);

        assertEquals(1, list.size());
        assertEquals("Paul", list.get(0));
    }

    @Test
    void removeMiddleElement() {

        list.add("John");
        list.add("Paul");
        list.add("Carl");

        list.remove(1);

        assertEquals(2, list.size());
        assertEquals("John", list.get(0));
        assertEquals("Carl", list.get(1));
    }
}
