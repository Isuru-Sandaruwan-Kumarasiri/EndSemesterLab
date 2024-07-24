package P_2019_2.Q_1;

public class LinkedList {
    Node tail;
    Node head;

    public LinkedList() {
        this.tail =this.head = null;

    }

    public void insert(int value){

        Node newNode=new Node(value);

        if(this.head==null){
            this.head=this.tail=newNode;    //NORMLA VIDIYAT PATAN GANNA
        }else {
            Node current=this.head;
            Node prev=null;
            while(current!=null){
                if(value<=current.data) {
                    if (current.equals(head)) {
                        newNode.next = current;
                        this.head = newNode;    //at the first term, value less than  head value ,this assign will be done
                                                //value =2      4->5->7->8
                    } else {
                        prev.next = newNode;
                        newNode.next = current;  // value is greater than head but less than maximum value in array ,this assign will be done
                                                 //value =6      4->5->7->8
                    }
                    return;
                }

                prev=current;
                current=current.next;//  when return part is met, those lines  are executing
            }
            tail.next=newNode;
            this.tail=newNode;     // if enter value is maximum value,this line will be executed
                                   //value =9     4->5->7->8
        }
    }

    public void display(){
        Node temp=this.head;
        while(!(temp==null)){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
    }
}
