// Problem: https://leetcode.com/problems/same-tree/
package leetcodeEasy;

public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

// This here is just to remove errors
  class TreeNode {
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

/* First try failed with [0, -5] [0, -8] inputs

        boolean answer = true;

        if(p != null && q == null) {
            return false;
        }
        if(p == null && q != null) return false;

        if(p != null && q != null) {
            if(p.val != q.val) return false;
            answer = isSameTree(p.left, q.left);
            answer = isSameTree(p.right, q.right);
        }

        return answer;
 */