
# Binary Tree Level Order Traversal


*link* : https://leetcode.com/problems/binary-tree-level-order-traversal/



**Explain: Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).**

-------
**input:Input: root = [3,9,20,null,null,15,7]**

**Output: [[3],[9,20],[15,7]]**




``` java
import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
      
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int len = q.size();
            for (int i = 0; i < len; i++) { // must using "len" instead of using .size() since when add.left and add.right will change queue size.
                TreeNode cur = q.poll();
                list.add(cur.val);
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right!= null) {
                    q.add(cur.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}

```