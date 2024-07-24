package P_2019.Q_2;

public class IPTree {

    ClassNode root;

    public IPTree() {
        this.root =new ClassNode(" ");
    }


    public  void selectTree(String ipClass,String ipAddress){
        IPNode newNode=new IPNode(ipAddress);
        switch (ipClass) {
            case "A" -> {
                if (root.ClassA == null) {
                    root.ClassA = newNode;
                } else {
                    root.ClassA = insertData(root.ClassA, newNode);
                }
            }
            case "B" -> {
                if (root.ClassB == null) {
                    root.ClassB = newNode;
                } else {
                    root.ClassB = insertData(root.ClassB, newNode);
                }
            }
            case "C" -> {
                if (root.ClassC == null) {
                    root.ClassC = newNode;
                } else {
                    root.ClassC = insertData(root.ClassC, newNode);
                }
            }
        }
    }
    
    
    public IPNode insertData(IPNode root ,IPNode newNode){
        
        if(root==null){

            root=newNode;
            
        } else if (Integer.parseInt(root.ipAddress.split("\\.")[0])>Integer.parseInt(newNode.ipAddress.split("\\.")[0])) {

            root.left=insertData(root.left,newNode);
            
        }else if(Integer.parseInt(root.ipAddress.split("\\.")[0])<Integer.parseInt(newNode.ipAddress.split("\\.")[0])){

            root.right=insertData(root.left,newNode);
        }
        return root;
    }

    public void preOrder() {
        System.out.println(this.root.ipAddresses);
        preOrderTraversal(this.root.ClassC);
    }

    private void preOrderTraversal(IPNode root) {
        if(root == null) {
            return;
        }
        System.out.println(root.ipAddress);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void getLevel(String ipClass,String ipAddress){
        int level=0;
        switch (ipClass){
            case "A":
                level=Level(root.ClassA,Integer.parseInt(ipAddress.split("\\.")[0]),level);

                break;
            case "B":
                level=Level(root.ClassB,Integer.parseInt(ipAddress.split("\\.")[0]),level);
                break;
            case "C":
                level=Level(root.ClassC,Integer.parseInt(ipAddress.split("\\.")[0]),level);
                break;


        }
        System.out.println(level);
    }
    public  int Level(IPNode root,int data,int level){
        if(root==null){
            return 0;
        }
        if(data==Integer.parseInt(root.ipAddress.split("\\.")[0])){
            return level;
        }
        int n=Level(root.left,data,level++);
        if(n!=0){
            return n;
        }
        n=Level(root.left,data,level++);
        return n;
    }
}
