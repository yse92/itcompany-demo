package com.solvd.customLinkedList;

public class CustomLinkedList<T> {
    Node head;

    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertAtStart(T data) {
        Node<T> newNode = new Node<T>(data);

        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, T data) {
        if(index == 0) {
            insertAtStart(data);
        } else {
            Node<T> newNode = new Node<T>(data);

            Node currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void deleteAt(int index) {
        if(index == 0) {
            head = head.next;
        } else {
            Node currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
    }

    public void show() {
        Node currentNode = head;
        if(currentNode == null) {
            System.out.println("Linked list is empty");
        } else {
            while(currentNode != null) {
                System.out.println(currentNode.data.toString());
                currentNode = currentNode.next;
            }
        }
    }
}
