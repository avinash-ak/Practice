class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class Lowestcomman {

    Node lowestAncestor(Node root, int n1, int n2) {
        if (root.data > Math.max(n1, n2)) {
            return lowestAncestor(root.left, n1, n2);
        } else if (root.data < Math.min(n1, n2)) {
            return lowestAncestor(root.right, n1, n2);
        } else {
            return root;
        }

    }

    Node root;

    public static void main(String[] args) {
        Lowestcomman obj = new Lowestcomman();

        obj.root = new Node(10);
        obj.root.left = new Node(8);
        obj.root.left.left = new Node(6);
        obj.root.left.right = new Node(9);
        obj.root.right = new Node(30);
        obj.root.right.left = new Node(25);
        obj.root.right.right = new Node(60);

        int n1 = 6;
        int n2 = 9;
        Node ans = obj.lowestAncestor(obj.root, n1, n2);
        System.out.println(ans.data);
    }

}