package Trees.BST;

//BST Search operation.
class champ {
    int data;
    Node left, right;

    champ(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class bst2 {


    public static Node Search(Node node, int data) {
        if (node == null || node.data == data) {
            return node;
        }

        if (node.data > data) {
            return Search(node.left, data);
        } else {
            return Search(node.right, data);
        }
    }


    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        if ((Search(root, 500) != null)) {
            System.out.println("Found the element");
        } else {
            System.out.println("Not found");
        }

    }
}
