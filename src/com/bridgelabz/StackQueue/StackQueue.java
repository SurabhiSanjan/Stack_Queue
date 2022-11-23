package com.bridgelabz.StackQueue;

public class StackQueue {
    Stack head;
    class Stack {
        int data;
        Stack next;
        Stack(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void printNode () {
        if (head == null) {
            System.out.println("Stack list is empty...");
            return;
        }
        Stack tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "=>");
            tempNode = tempNode.next;
        }
        System.out.println("null  is our current Stack");
    }
    public void push(int data){
        Stack newStack = new Stack(data);
        if(head == null){
            head = newStack;
            return;
        }
        newStack.next = head;
        head = newStack;
    }

    public void pop(){
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        head = head.next;
    }
    public static void main (String[] args){
        System.out.println("Welcome to Stack & Queue Practice Problem");
        StackQueue ll = new StackQueue();
        ll.push(70);
        ll.push(30);
        ll.push(56);
        ll.printNode();
        ll.pop();
        System.out.println("After performing POP operation--------");
        ll.printNode();

}}
