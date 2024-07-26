package P_2019_2.Q_2;

public class Stack {

    private Node top;

    public Stack() {
        this.top=null;
    }

    public void push(String tag,String ClassName, String id){
        Node newTag=new Node(tag, ClassName,id );

        if(top==null){
            this.top=newTag;
        }else{
            newTag.setNext(newTag);
            this.top=newTag;
        }
    }

    public void pop(){
        if(this.top==null){
            System.out.println("not found");
        }else {
            Node temp=this.top;
            this.top=temp.getNext();
            temp.setNext(null);
        }
    }

    public void display(){
        Node temp=this.top;
        while (!(this.top==null)){
            System.out.print(temp.getTag() +" ");
            temp=temp.getNext();
        }

    }
}
