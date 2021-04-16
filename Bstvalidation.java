class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class Bstvalidation {
    Node root;

    boolean isBst() {
        return validBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean validBst(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data < min || node.data > max) {
            return false;
        }
        return validBst(node.left, min, node.data) && validBst(node.right, node.data, max);
    }

    public static void main(String[] args) {
        Bstvalidation obj = new Bstvalidation();
        obj.root = new Node(4);
        obj.root.left = new Node(2);
        obj.root.right = new Node(5);
        obj.root.left.left = new Node(1);
        obj.root.left.right = new Node(3);

        if (obj.isBst()) {
            System.out.println("It is BST");
        } else {
            System.out.println("Not a BST");
        }

    }
}
