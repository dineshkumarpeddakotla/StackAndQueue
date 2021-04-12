package com.stackandqueue;

public class Queue<K> {
    LinkedList<K> linkedList = new LinkedList<>();

    public void enqueue(INode<K> node) {
        linkedList.append(node);
    }

    public INode<K> latestKeyOfQueue() {
        return linkedList.head;
    }

    public void printQueue() {
        linkedList.printNode();
    }
}
