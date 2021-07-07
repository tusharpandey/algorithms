package linkedlist.classModel;

import linkedlist.Node;

public class LinkedListClass {
    Node startNode;

    public void createLinkedList(int limit,int size) {
        Node previous = null;
        for (int i = limit; i < limit + size; i++) {
            Node node = new Node();
            node.setValue(i);
            if (i == limit) startNode = node;
            if (previous != null) previous.setNext(node);
            previous = node;
        }
        getStartNode();
    }

    public Node getStartNode() {
        return startNode;
    }

    public void printLinkedList(String message) {
        System.out.println("\n" + message);
        Node current = startNode;
        while (current != null) {
            System.out.print(current.getValue() + (current.getNext() == null ? "" : " -> "));
            current = current.getNext();
        }
    }

    public void printLinkedList(Node node,String message) {
        System.out.println("\n" + message);
        Node current = node;
        while (current != null) {
            System.out.print(current.getValue() + (current.getNext() == null ? "" : " -> "));
            current = current.getNext();
        }
    }
}
