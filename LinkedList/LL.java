import java.util.*;
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
//    -- Delete a node from first
    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty LinkedList");
            return;
        }
        head = head.next;
    }
//    -- Delete a node from Last
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty LinkedList");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
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
//  -- Delete data in LinkedList
    public void deleteData(String data){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        Node trackNode = head;
        Node lastNode = head.next;
        while (!Objects.equals(lastNode.data, data)){
            trackNode = trackNode.next;
            lastNode = lastNode.next;
        }
        trackNode.next = lastNode.next;
    }
    public static void main(String[] args) {
        LL List  = new LL();
        List.addLast("Hello");
        List.addLast("World");
        List.addLast("Worlds");
        List.addLast("Worlda");
        List.addLast("!!!");
        List.deleteData("Worlds");
        List.printLL();


    }
}
