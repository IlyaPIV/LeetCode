package problems.easy.p0543;

public class JavaSolution {

    private int ans;

    public int diameterOfBinaryTree(JavaTreeNode root) {
        if (root == null) return 0;

        height(root);
        return ans;
    }

    private int height(JavaTreeNode node){
        if (node == null) return -1;
        int left = height(node.left);
        int right = height(node.right);

        ans = Math.max(ans, left + right + 2);

        return 1 + Math.max(left, right);
    }

}
