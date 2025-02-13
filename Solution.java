public class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode(int x) {
val = x;
}
}

public class Solution {
public static TreeNode LCABinaryTree(TreeNode root, TreeNode p, TreeNode q) {
if(root == null || root == q || root == p) return root;
TreeNode lt = LCABinaryTree(root.left,p,q);
TreeNode rt = LCABinaryTree(root.right,p,q);
if(lt!=null && rt!=null ){
return root;
}
return lt!=null ? lt:rt;
}
}
