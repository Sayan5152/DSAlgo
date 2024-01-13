package trees;

class Node {
    int data;
    Node leftNode;
    Node rightNode;

    public Node(int data) {
        this.data = data;
        leftNode = rightNode = null;
    }
}

public class TreeBasics {
    public static void main(String args[]) {
        Node node = new Node(5);

        Node node1 = new Node(10);
        node.leftNode = node1;

        Node node2 = new Node(15);
        node.rightNode = node2;
    }
}
