package com.company;

public class LinkList {
    private class Node{
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    // addFirst
    public void addFirst(int item){
        Node node = new Node(item);
        //node.value = item;
        if (isEmpty())
            first = last = node;
        else{
            node.next = node;
            first = node;
        }
    }
    private boolean isEmpty(){
        return first ==null;
    }
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
