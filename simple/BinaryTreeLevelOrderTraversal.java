package simple;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> tree = new ArrayList<List<Integer>>();
            store(root, 0, tree);
            return tree;
        }
        public void store(TreeNode node, int levelofTree, List<List<Integer>> lists) {

            if (node == null) return ;

            if (lists.size() <= levelofTree)
                lists.add(new ArrayList<>());

            lists.get(levelofTree).add(node.val);

            store(node.left, levelofTree+1, lists);
            store(node.right, levelofTree+1, lists);
        }
    }
}
