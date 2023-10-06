package simple;

public class ConstructStringfromBinaryTree {

     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    class Solution {
        public String tree2str(TreeNode root) {
            StringBuilder result = new StringBuilder();
            constructString(root,result);
            return result.toString();
        }

        public void  constructString(TreeNode root,StringBuilder str){
            if(root==null) return;
            str.append(root.val);
            if(root.left==null && root.right==null) return;

            if(root.left!=null) {
                str.append('(');
                constructString(root.left, str);
                str.append(')');
            }
            if(root.right!=null){
                str.append('(');
                constructString(root.right,str);
                str.append(')');
            }
        }
    }
}
