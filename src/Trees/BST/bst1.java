package Trees.BST;


//BST Insert operation.
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class bst1 {


    public static Node insert(Node root, int data) {
//        if root==null then return newNode
        if (root == null) {
            return new Node(data);
        }

        if (root.data == data) {
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + "\t");
        inOrder(node.right);
    }

    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "\t");
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("Inorder traversal: ");
        inOrder(root);
        System.out.println();
        System.out.println("preorder traversal: ");
        preOrder(root);
        System.out.println();
        System.out.println("postorder traversal: ");
        postOrder(root);

    }
}
