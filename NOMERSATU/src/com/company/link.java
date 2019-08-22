package com.company;

public class link <L> implements ddl <L> {
    private node top;
    int capacity;
    public int size;

    public link(int capacity) {
        this.top = null;
        this.size = 0;
        this.capacity = capacity;
    }


    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void push(L data) {
        node newnode = new node(data);
        if (size == 0) {
            top = newnode;

        } else if (isFull()) {
            System.out.println("stack melebihi batas ");
        } else {
            newnode.next = top;
            top = newnode;

        }
        size++;

    }

    @Override
    public void delete() {
        top = null;
    }


    @Override
    public L viewtampil() {
        node capacity = top;
        if (size == 0) {
            System.out.println("data anda kosong");
        } else {
            while (capacity != null) {
                capacity.tampil();
                capacity = capacity.next;
            }
        }
        return null;
    }

    @Override
    public boolean isFull() {
        if (size == capacity) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

}