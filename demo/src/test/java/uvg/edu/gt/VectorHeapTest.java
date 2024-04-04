package uvg.edu.gt;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class VectorHeapTest {

    @Test
    public void testAdd() {
        VectorHeap<Integer> heap = new VectorHeap<>();
        heap.add(3);
        heap.add(2);
        heap.add(5);
        heap.add(1);
        heap.add(4);

        assertEquals(1, (int) heap.remove());
        assertEquals(2, (int) heap.remove());
        assertEquals(3, (int) heap.remove());
        assertEquals(4, (int) heap.remove());
        assertEquals(5, (int) heap.remove());
    }

    @Test
    public void testRemove() {
        VectorHeap<String> heap = new VectorHeap<>();
        heap.add("Apple");
        heap.add("Banana");
        heap.add("Cherry");

        assertEquals("Apple", heap.remove());
        assertEquals("Banana", heap.remove());
        assertEquals("Cherry", heap.remove());
    }
}
