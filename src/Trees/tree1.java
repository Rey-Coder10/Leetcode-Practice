package Trees;

//Basic Tree data structure program and its traversal using DFS(in-order,pre-order,post-order)
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class tree1 {

    Node root;

    tree1(int data) {
        root = new Node(data);
    }

    tree1() {
        this.root = null;
    }

//    DFS
//    Pre-order traversal->Root,Left,Right

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "\t");

        preOrder(node.left);
        preOrder(node.right);
    }


//In-order traversal->Left-Root-Right

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + "\t");
        inOrder(node.right);
    }

//    post-order traversal->Left,Right,Root

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "\t");

    }

    public static void main(String[] args) {
        System.out.println("Program Started!!");
        tree1 tr = new tree1();

//        Root Node
        tr.root = new Node(1);

//    Root left child
        Node node2 = new Node(2);
        tr.root.left = node2;

//        Root right child
        Node node3 = new Node(3);
        tr.root.right = node3;

//        Root left-left child
        Node node4 = new Node(4);
        tr.root.left.left = node4;


//        Root left right child
        Node node5 = new Node(5);
        tr.root.left.right = node5;

//        Root right-right child
        Node node6 = new Node(6);
        tr.root.right.left = node6;

        Node node7 = new Node(7);
        tr.root.right.right = node7;

//        Traversal

        System.out.println("In-order traversal: ");
        tr.inOrder(tr.root);
        System.out.println();

        System.out.println("Pre-order traversal: ");
        tr.preOrder(tr.root);
        System.out.println();

        System.out.println("Post-order traversal: ");
        tr.postOrder(tr.root);


    }
}
