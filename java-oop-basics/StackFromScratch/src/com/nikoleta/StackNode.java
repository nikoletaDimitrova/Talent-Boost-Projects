package com.nikoleta;

public class StackNode {
    public int value;
    public StackNode next;

    public StackNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public StackNode getNext() {
        return this.next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }
}
