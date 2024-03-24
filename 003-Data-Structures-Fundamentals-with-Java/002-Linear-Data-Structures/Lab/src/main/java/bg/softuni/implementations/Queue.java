package bg.softuni.implementations;

import bg.softuni.interfaces.AbstractQueue;

import java.util.Iterator;

public class Queue<E> implements AbstractQueue<E> {
    private E[] data;
    private int size;
    private int capacity = 4;
    private int front;

    public Queue() {
        this.data = (E[]) new Object[this.capacity];
        this.front = 0;
    }

    @Override
    public void offer(E element) {
        if (this.size == this.capacity) {
            this.data = resize();
            this.capacity *= 2;
        }

        this.data[this.size] = element;
        this.size++;
    }

    @Override
    public E poll() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Empty Queue");
        }

        var first = this.data[this.front];

        if (this.size() >= 0) {
            System.arraycopy(data, 1, data, 0, this.size());
        }

        this.size--;
        return first;
    }

    @Override
    public E peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Empty Queue");
        }

        return this.data[this.front];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private E[] resize() {
        var newArray = (E[]) new Object[this.capacity * 2];

        System.arraycopy(this.data, 0, newArray, 0, this.data.length);

        return newArray;
    }

    private final class ListIterator implements Iterator<E> {
        private int index;

        @Override
        public boolean hasNext() {
            return index == size();
        }

        @Override
        public E next() {
            var value = data[this.index];
            this.index++;
            return value;
        }
    }
}