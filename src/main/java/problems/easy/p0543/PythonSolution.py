from typing import Optional
from PythonTreeNode import TreeNode

class Solution:
    def __init__(self):
        self.diameter = 0

    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.depth(root)
        return self.diameter

    def depth(self, node: Optional[TreeNode]) -> int:
        left = self.depth(node.left) if node.left else 0
        right = self.depth(node.right) if node.right else 0

        if left + right > self.diameter:
            self.diameter = left + right

        return 1 + (left if left > right else right)
