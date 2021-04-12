package com.stackandqueue;

public class Stack<K> {
    private LinkedList<K> linkedList = new LinkedList<>();

    public void push(INode<K> node) {
        linkedList.add(node);
    }

    public INode<K> peak() {
        return linkedList.head;
    }

    public void printStack() {
        linkedList.printNode();
    }
}
