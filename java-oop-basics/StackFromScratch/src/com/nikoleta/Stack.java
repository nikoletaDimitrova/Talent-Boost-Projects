package com.nikoleta;

public class Stack {
    public StackNode head = new StackNode(0);
    public StackNode current;
    public int size;

    public Stack() {
        this.current = this.head;
    }

    public void push(int value) {
        this.current = new StackNode(value);
        this.current.setNext(this.head);
        this.head = this.current;
        ++this.size;
    }

    public int peek() {
        return this.head.getValue();
    }

    public int pop() {
        int topValue = 0;
        try {
            topValue = this.head.value;
            this.head = this.head.next;
            --this.size;
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("Error in pop: " + e.getMessage());
        } finally {

            return topValue;

        }
    }

    public int getSize() {
        return this.size;
    }
}
