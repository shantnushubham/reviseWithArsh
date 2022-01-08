package revisewitharsh.goldman_sachs;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        Node node = new Node(1, new Node(2, new Node(3, new Node(4), new Node(4)), new Node(3)), new Node(2));
        System.out.println(isBalanced(node));
    }

    public static boolean isBalanced(Node root) {
        return height(root) != -1;
    }

    public static int height(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (Math.abs(leftHeight - rightHeight) > 1
                || leftHeight == -1
                || rightHeight == -1
        ) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }

    Node(int d, Node left, Node right) {
        data = d;
        this.left = left;
        this.right = right;
    }
}