package simple;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {



    class Solution {
        List<String> ans = new ArrayList<>();
        public List<String> binaryTreePaths(TreeNode root) {

            if(root == null)
                return ans;

            treePathString(root,"");
            return ans;
        }
        public void treePathString(TreeNode root,String str){
            if(root ==  null)
                return;

            if(root.left == null && root.right == null){
                ans.add(str+root.val);
            }

            treePathString(root.left,str+root.val+"->");
            treePathString(root.right,str+root.val+"->");
        }

    }




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


}
