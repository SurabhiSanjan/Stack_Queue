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
        System.out.println("null  is our current Queue");
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

    public void pushQ(int data) {
        Stack newQueue = new Stack(data);
        if (head == null) {
            head = newQueue;
            return;
        }
        Stack tempNode = head;
        while(tempNode.next != null){
            tempNode= tempNode.next;
        }
        tempNode.next = newQueue;
    }

    public void popQ(){
            if(head == null){
                if(head == null){
                    System.out.println(" the list is empty");
                    System.out.println(" the list is empty");
                    return;
                }
            }
            head = head.next;
        }



    public static void main (String[] args){
        System.out.println("Welcome to Stack & Queue Practice Problem");
        StackQueue ll = new StackQueue();
        ll.pushQ(56);
        ll.pushQ(30);
        ll.pushQ(70);
        ll.printNode();
        System.out.println("After applying Pop operation-----------");
        ll.popQ();
        ll.printNode();


}}
