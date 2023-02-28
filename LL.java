package com.kk.first_package;

public class LL {
    //Class node created
    class Node{
        String data;
        Node next;
        Node(String data){
            this.next=null;
            this.data=data;
        }
    }
    Node head;
//    insertion operation started
//    -- Add First Operation
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
//    -- Add First Operation
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
//    -- Traverse Operation and print the LinkedList
    public void printLL(){
        if(head == null){
            System.out.print("List is Empty");
            return;
        }
        Node currentNode = head;
        while (currentNode!=null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
    public static void main(String[] args) {
        LL List  = new LL();
        List.addLast("Hello");
        List.addLast("World");
        List.addLast("!");
        List.printLL();


    }
}
