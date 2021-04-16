class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class Pathsum {
    Node root;

    boolean validPathSum(Node node, int sum) {
        if (node == null) {
            return sum == 0;
        }

        return validPathSum(node.left, sum - node.data) || validPathSum(node.right, sum - node.data);
    }

    public static void main(String[] args) {

        int targetSum = 14;

        Pathsum obj = new Pathsum();
        obj.root = new Node(10);
        obj.root.left = new Node(8);
        obj.root.right = new Node(2);
        obj.root.left.left = new Node(3);
        obj.root.left.right = new Node(5);
        obj.root.right.left = new Node(2);

        if (obj.validPathSum(obj.root, targetSum)) {
            System.out.println("Path Exists");
        } else {
            System.out.println("Path doesn't Exists");
        }

    }
}
