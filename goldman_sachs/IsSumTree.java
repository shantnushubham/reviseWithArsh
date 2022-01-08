package revisewitharsh.goldman_sachs;

public class IsSumTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10,
                new TreeNode(20, new TreeNode(10), new TreeNode(10)), new TreeNode(30));
        System.out.println(isSumTree(root));
    }

    public static boolean isSumTree(TreeNode node) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            return true;
        }
        return findSum(node) == node.data;
    }

    public static int findSum(TreeNode node) {
        int sum = 0;
        if (node.left != null) {
            sum += node.left.data;
            sum += findSum(node.left);
        }
        if (node.right != null) {
            sum += node.right.data;
            sum += findSum(node.right);
        }
        return sum;
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
