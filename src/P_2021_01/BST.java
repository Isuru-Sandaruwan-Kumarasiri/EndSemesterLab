package P_2021_01;

public class BST {

    private TreeNode root;

    public BST() {
        CharNode charNode=new CharNode('/',"");
        this.root = new TreeNode(charNode);
    }


    public void insert (String charCode,char character){

        CharNode charNode=new CharNode(character,charCode);
        TreeNode newNode=new TreeNode(charNode);
        this.root=insertTreeNode(this.root,newNode,0);
    }
    private TreeNode insertTreeNode(TreeNode root,TreeNode newNode,int index){
        if(root==null){
            root=newNode;
            return root;
        }else if (newNode.getData().charCode.toCharArray()[index] == '0') {
                root.setLeft(insertTreeNode(root.getLeft(), newNode, index++));
        } else if (newNode.getData().charCode.toCharArray()[index] == '1') {
                root.setRight(insertTreeNode(root.getRight(), newNode, index++));
        }



        return  root;
    }

    public void inOrder(){
        inOrderTraversal(this.root);
    }

    private void inOrderTraversal(TreeNode root){

        if(root != null){
            inOrderTraversal(root.getLeft());                //left
            System.out.print(root.getData().character + " ");          //root
            inOrderTraversal(root.getRight());               //right
        }
    }

    public void searchCharacterCode(char character) {
        search(this.root, character);
    }


private void search(TreeNode root, char character) {
    if (root != null) {
        // Search the left subtree
        if (root.getData().character == character) {
            System.out.print(root.getData().charCode);
        } else {
            search(root.getLeft(), character);
            search(root.getRight(), character);
        }
    }
  }

    public void searchCharacter(String code) {
        searchCharacter(this.root, code);
    }


    private void searchCharacter(TreeNode root, String code) {
        if (root != null) {
            // Search the left subtree
            if (root.getData().charCode.equals(code)) {
                System.out.print(root.getData().character);
            } else {
                searchCharacter(root.getLeft(), code);
                searchCharacter(root.getRight(), code);
            }
        }
    }

}
