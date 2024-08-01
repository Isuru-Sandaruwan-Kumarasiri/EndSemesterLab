package P_2021_01;

public class TreeNode {

    private CharNode data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(CharNode data) {
        this.data = data;
    }

    public CharNode getData() {
        return data;
    }

    public void setData(CharNode data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
