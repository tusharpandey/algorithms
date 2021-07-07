package linkedlist;

public class ReverseOfLinkedList {

    LinkedListNode start = null;
    LinkedListNode current = null;

    public static void main(String[] args) {
        ReverseOfLinkedList object = new ReverseOfLinkedList();
        object.process();
    }

    public void process(){
        addNode(createNode(1));
        addNode(createNode(5));
        addNode(createNode(7));
        addNode(createNode(10));
        printLinkedList();
        reverseAgain();
        printLinkedList();
    }

    public void addNode(LinkedListNode node){
        if(start == null){
            start = node;
            current = node;
            return;
        }

        current.nextNode = node;
        current = current.nextNode;
    }

    public void printLinkedList(){
        current = start;
        while (current != null){
            System.out.print(current.value + (current.nextNode == null ? " -> null" : " -> "));
            current = current.nextNode;
        }
        System.out.println("");
    }

    public void reverseOfLinkedList(){
        current = start;
        LinkedListNode prev = null;

        while (current != null){
            LinkedListNode next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;

            if(current == null){
                start = prev;
            }
        }

        printLinkedList();
    }

    public LinkedListNode createNode(int value){
        return new LinkedListNode(value);
    }

    public void reverseAgain(){
        current = start;
        LinkedListNode prev = null;

        while (current != null){
            if(current.nextNode == null){
                start = current;
            }
            LinkedListNode next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }
    }


}

class LinkedListNode {
    int value;
    LinkedListNode nextNode;

    public LinkedListNode(int value){
        this.value = value;
    }
}
