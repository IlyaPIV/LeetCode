package problems.easy.p2236;

public class JavaSolution {
    public boolean checkTree(JavaTreeNode root) {
        if (root.left == null || root.right == null) return false;

        return root.val == (root.left.val + root.right.val);
    }
}
