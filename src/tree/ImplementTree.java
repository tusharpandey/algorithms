package tree;

public class ImplementTree {

    Node rootNode;
    Node currentNode;

    public static void main(String[] args) {
        ImplementTree object = new ImplementTree();
        object.process();
        object.currentNode = object.rootNode;
        object.traverseNode(object.currentNode);
        System.out.println("max depth : " + object.maxDepth(object.rootNode));
    }

    private void process() {
        rootNode = new Node(0);
        rootNode.setLeftNode(new Node(1));
        rootNode.setRightNode(new Node(2));
        rootNode.getLeftNode().setLeftNode(new Node((4)));
        rootNode.getLeftNode().setRightNode(new Node((5)));
        rootNode.getRightNode().setLeftNode(new Node((6)));
        rootNode.getRightNode().setRightNode(new Node((7)));
    }

    public void traverseNode(Node node) {
        if (node == null) return;
        System.out.println("node is : " + node.getValue());
        traverseNode(node.getLeftNode());
        traverseNode(node.getRightNode());
    }

    int maxDepth(Node root) {
        if (root == null)
            return 0;

        int leftDepth = maxDepth(root.getLeftNode());
        int rightDepth = maxDepth(root.getRightNode());

        if (leftDepth > rightDepth)
            return (leftDepth + 1);
        else
            return (rightDepth + 1);
    }
}
