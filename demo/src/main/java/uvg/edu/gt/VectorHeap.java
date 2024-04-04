package uvg.edu.gt;

import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> {
    private ArrayList<E> heap;

    public VectorHeap() {
        heap = new ArrayList<>();
    }

    public void add(E element) {
        heap.add(element);
        percolateUp(heap.size() - 1);
    }

    public E remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        E removed = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            percolateDown(0);
        }
        return removed;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void percolateUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            E current = heap.get(index);
            E parent = heap.get(parentIndex);
            if (current.compareTo(parent) < 0) {
                heap.set(index, parent);
                heap.set(parentIndex, current);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void percolateDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallest = index;

        if (leftChildIndex < heap.size() && heap.get(leftChildIndex).compareTo(heap.get(smallest)) < 0) {
            smallest = leftChildIndex;
        }
        if (rightChildIndex < heap.size() && heap.get(rightChildIndex).compareTo(heap.get(smallest)) < 0) {
            smallest = rightChildIndex;
        }

        if (smallest != index) {
            E temp = heap.get(index);
            heap.set(index, heap.get(smallest));
            heap.set(smallest, temp);
            percolateDown(smallest);
        }
    }
}

