class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class Lcabinarytree {

    Node getLowest(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = getLowest(root.left, n1, n2);
        Node right = getLowest(root.right, n1, n2);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    Node root;

    public static void main(String[] args) {
        Lcabinarytree obj = new Lcabinarytree();
        obj.root = new Node(3);
        obj.root.left = new Node(6);
        obj.root.right = new Node(8);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(9);
        int n1 = 6, n2 = 8;

        Node ans = obj.getLowest(obj.root, n1, n2);
        System.out.println(ans.data);
    }
}
