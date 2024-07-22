package P_2019.Q_1;

public class Stack {

    private Node top;

    public Stack() {
        this.top=null;
    }

    public void push(int data){
        Node newNode=new Node(data);
        if(this.top==null){
            this.top=newNode;
        }else{
            newNode.setNext(this.top);
            this.top=newNode;
        }
    }

    public void pop(){
        Node temp=this.top;
        this.top=temp.getNext();
        temp.setNext(null);
    }

    public void display(){
        Node temp=this.top;

        while(!(temp==null)){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println();
    }
}
