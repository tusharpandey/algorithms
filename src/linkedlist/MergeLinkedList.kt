package linkedlist

import linkedlist.classModel.LinkedListClass


fun main(args: Array<String>) {
    var linkedListObject = LinkedListClass()
    var linkedList1 = linkedListObject.createLinkedList(5, 3)
    var linkedListObject1 = LinkedListClass()
    var linkedList2 = linkedListObject1.createLinkedList(10, 4)

    linkedListObject.printLinkedList("linked list 1 : ")
    linkedListObject1.printLinkedList("linked list 2 : ")

    var list1CurrentNode = linkedListObject.startNode;
    var list2CurrentNode = linkedListObject1.startNode;

    var mergedListStartingNode = list1CurrentNode
    var mergedListEndNode = list1CurrentNode

    var node = null;

    while (list1CurrentNode != null && list2CurrentNode != null) {

        var list1NextNode = list1CurrentNode.next
        var list2NextNode = list2CurrentNode.next

        list1CurrentNode.next = list2CurrentNode
        list2CurrentNode?.next = list1NextNode

        list1CurrentNode = list1NextNode
        list2CurrentNode = list2NextNode
    }

    while (mergedListEndNode.next != null) {
        mergedListEndNode = mergedListEndNode.next
    }

    //Adding remaining elements of linked list 1
    while (list1CurrentNode != null) {
        var list1NextNode = list1CurrentNode?.next
        mergedListEndNode?.next = list1CurrentNode
        mergedListEndNode = mergedListEndNode.next
        list1CurrentNode = list1NextNode
    }

//    Adding remaining elements of linked list 2
    while (list2CurrentNode != null){
        var list2NextNode = list2CurrentNode?.next
        mergedListEndNode?.next = list2CurrentNode
        mergedListEndNode = mergedListEndNode.next
        list2CurrentNode = list2NextNode
    }

    linkedListObject.printLinkedList(mergedListStartingNode, "merged linked list : ")
}