import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }

}

public class Levelorderqo {

    public void levelOrder(Node node) {
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            root = q.poll();
            if (root != null) {
                System.out.print(root.data + " ");
                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }
            } else {
                if (!q.isEmpty()) {
                    System.out.println();
                    q.offer(null);
                }
            }

        }

    }

    Node root;

    public static void main(String[] args) {
        Levelorderqo obj = new Levelorderqo();
        obj.root = new Node(5);
        obj.root.left = new Node(3);
        obj.root.right = new Node(7);
        obj.root.left.left = new Node(2);
        obj.root.left.right = new Node(4);
        obj.root.right.right = new Node(8);

        obj.levelOrder(obj.root);
    }
}