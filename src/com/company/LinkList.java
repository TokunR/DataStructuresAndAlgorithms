package com.company;



import java.util.NoSuchElementException;

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

    // addLast
    public void addLast(int item){
        Node node = new Node(item);
        //node.value = item;
        if (isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
    }
    // addFirst
    public void addFirst (int item){
        Node node = new Node (item);

        if (isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }

    }
    private boolean isEmpty(){
        return first ==null;
    }

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    // contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // deleteFirst
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;
    }
        // deleteLast
        public void removeLast(){
            if (isEmpty())
                throw new NoSuchElementException();
            if (first == last) {
                first = last = null;
                return;
            }

            Node previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        private Node getPrevious (Node node){
            Node current = first;
            while (current != null) {
                if (current.next == last) return current;
                current = current.next;
            }
            return null;

    }



 
}
