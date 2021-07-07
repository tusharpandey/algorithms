package linkedlist

import util.Utility

var startNode: Node? = null
var endNode: Node? = null

fun main(args: Array<String>) {
    createLinkedList()
    printLinkedList()
    printStartNode()
    printEndNode()
}

fun createLinkedList(limit : Int = 0){
    for (i in limit until limit + 5) {
        addElementInLinkedList(i)
    }
}

fun addElementInLinkedList(value : Int = 10) {
    var node = createNode(value)

    if(startNode == null){
        startNode = node
        endNode = node
    }

    endNode?.next = node
    endNode = endNode?.next
}

fun createNode(value : Int): Node {
    var node: Node = Node()
    node.value = value
    return node
}

fun printLinkedList(){
    var currentNode = startNode
    while (currentNode != null){
        Utility.print(currentNode.value)
        currentNode = currentNode.next
    }
}

fun printLinkedList(node : Node?){
    var currentNode = node
    while (currentNode != null){
        Utility.print(currentNode.value)
        currentNode = currentNode?.next
    }
}

fun printStartNode(){
    Utility.print("start node : " + startNode?.value)
    Utility.print("start node next : " + startNode?.next?.value)
}

fun printEndNode(){
    Utility.print("end node : " + endNode?.value)
    Utility.print("end node next : " + endNode?.next)
}
