public class _98 {
    public static class TreeNode {
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
        TreeNode prev = null;
        public  boolean isValidBST(TreeNode root) {
            if(root == null) {
                return true;
            }

            if(isValidBST(root.left) && (prev == null || root.val > prev.val)) {
                prev = root;
                return isValidBST(root.right);
            }

            return false;
        }
    }





}
