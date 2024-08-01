package P_2021_02;

class TreeNode {

    CharacterNode data;

    TreeNode left;
    TreeNode right;

    public TreeNode(CharacterNode data) {
        this.data = data;
        this.right=this.left=null;
    }
}
