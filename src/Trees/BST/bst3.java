package Trees.BST;

//BST Delete operation
class slit {
    int data;
    Node left, right;

    slit(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class bst3 {


    public static Node deletion(Node node, int data) {
        if (node == null) {
            return node;
        }

        if (node.data > data) {
            node.left = deletion(node.left, data);
        } else if (node.data < data) {
            node.right = deletion(node.right, data);
        } else {
            if (node.left == null) {
                return node.right;
            }

            if (node.right == null) {
                return node.left;
            }
            Node succ = getSuccessor(node);
            node.data = succ.data;
            node.right = deletion(node.right, succ.data);
        }
        return node;
    }

    public static Node getSuccessor(Node node) {
        node = node.right;
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + "\t");
            inOrder(node.right);

        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        int x = 15;
        root = deletion(root, x);
        inOrder(root);
    }
}
