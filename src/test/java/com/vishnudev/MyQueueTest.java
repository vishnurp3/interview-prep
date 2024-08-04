package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    @DisplayName("Test MyQueue operations")
    void testMyQueue() {
        MyQueue queue = new MyQueue();

        assertTrue(queue.empty(), "Queue should be empty initially");

        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.peek(), "Peek should return 1");
        assertEquals(1, queue.pop(), "Pop should return 1");
        assertFalse(queue.empty(), "Queue should not be empty after one pop");

        queue.push(3);
        assertEquals(2, queue.pop(), "Pop should return 2");
        assertEquals(3, queue.pop(), "Pop should return 3");
        assertTrue(queue.empty(), "Queue should be empty after popping all elements");
    }
}
