package com.stackandqueue;

public class Stack<K> {
    private final LinkedList<K> linkedList = new LinkedList<>();

    public void push(INode<K> node) {
        linkedList.add(node);
    }

    public INode<K> peak() {
        return linkedList.head;
    }

    public INode<K> pop() {
        return linkedList.pop();
    }

    public void printStack() {
        linkedList.printNode();
    }
}
