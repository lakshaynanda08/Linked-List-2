// TC: O(1) amortized - worst case O(h)
// SC: O(h)
// Submitted on leetcode
// No problem faced

class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack();
        dfs(root);
    }
    
    public int next() {
        TreeNode popped = stack.pop();
        dfs(popped.right);
        return popped.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    private void dfs(TreeNode root) {
        while(root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}
