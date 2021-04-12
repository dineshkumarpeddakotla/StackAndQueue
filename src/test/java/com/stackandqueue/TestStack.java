package com.stackandqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStack {

    @Test
    public void given3IntegersWhenAddedShouldBeLast(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);

        Stack<Integer> stack = new Stack<>();

        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.printStack();

        INode<Integer> peak = stack.peak();

        Assertions.assertEquals(thirdNode, peak);
    }

    @Test
    public void given3IntegersIntoStackWhenPoppedShouldHaveLastAddedRemoved(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);

        Stack<Integer> stack = new Stack<>();

        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);

        INode<Integer> pop = stack.pop();

        stack.printStack();


        Assertions.assertEquals(thirdNode, pop);
    }
}
