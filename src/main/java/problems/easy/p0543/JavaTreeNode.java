package problems.easy.p0543;

public class JavaTreeNode {
    int val;
    JavaTreeNode left;
    JavaTreeNode right;
    JavaTreeNode() {}
    JavaTreeNode(int val) { this.val = val; }
    JavaTreeNode(int val, JavaTreeNode left, JavaTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}