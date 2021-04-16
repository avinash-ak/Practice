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

public class Levelorderqt {
    void levelTwoQueues(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        q1.add(root);
        while (!q1.isEmpty() || !q2.isEmpty()) {
            while (!q1.isEmpty()) {
                root = q1.poll();
                System.out.print(root.data + " ");
                if (root.left != null) {
                    q2.offer(root.left);
                }
                if (root.right != null) {
                    q2.offer(root.right);
                }
            }
            System.out.println();
            while (!q2.isEmpty()) {
                root = q2.poll();
                System.out.print(root.data + " ");
                if (root.left != null) {
                    q1.offer(root.left);
                }
                if (root.right != null) {
                    q1.offer(root.right);
                }
            }
            System.out.println();
        }
    }

    Node root;

    public static void main(String[] args) {
        Levelorderqt obj = new Levelorderqt();
        obj.root = new Node(4);
        obj.root.left = new Node(2);
        obj.root.right = new Node(5);
        obj.root.left.left = new Node(1);
        obj.root.left.right = new Node(3);

        obj.levelTwoQueues(obj.root);

    }
}
