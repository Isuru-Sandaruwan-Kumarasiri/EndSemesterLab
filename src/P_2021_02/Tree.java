package P_2021_02;

class Tree {

    private TreeNode root;

    public Tree() {
        this.root = new TreeNode(new CharacterNode("",'/'));
    }

    public void insertCharacter(CharacterNode data){
        TreeNode newNode=new TreeNode(data);
        this.root=insert(this.root,newNode,0);
    }
    private  TreeNode insert(TreeNode root, TreeNode newNode,int index){

        if(root==null){
            root=newNode;
            return  root;
        }else if (newNode.data.morseCode.toCharArray()[index]=='.') {
            root.left=insert(root.left,newNode,index+1);
        }else if (newNode.data.morseCode.toCharArray()[index]=='-') {
            root.right= insert(root.right, newNode, index+1);
        }
        return root;
    }

    public void inOrderTraversal(){
            inorder(this.root);
    }

    private void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data.character+"-->");
            inorder(root.right);
        }
    }
}
